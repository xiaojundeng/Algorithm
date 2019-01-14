import junit.framework.TestCase;

public class ListTest extends TestCase {
    public ListTest(String testName){
        super(testName);
    }

    public void testArrayList(){
        System.out.println("-------创建线性表-------");
        ArrayList arrayList = new ArrayList();
        System.out.println("线性表长度:"+arrayList.length());

        System.out.println("-------插入数据-------");
        arrayList.insert(0, 1);
        arrayList.insert(0, 2);
        arrayList.insert(1, 3);
        arrayList.insert(1, 4);
        arrayList.display();
        System.out.println("线性表长度:"+arrayList.length());

        System.out.println("-------获取元素-------");
        System.out.println("第0号元素:"+arrayList.get(0));
        System.out.println("值为1的元素的下标:"+arrayList.indexOf(1));
        System.out.println("值为4的元素的下标:"+arrayList.indexOf(4));
        System.out.println("值为1的元素前驱:"+arrayList.pre(1));
        System.out.println("值为1的元素的后继:"+arrayList.next(1));
        System.out.println("值为2的元素前驱:"+arrayList.pre(2));
        System.out.println("值为2的元素的后继:"+arrayList.next(2));
        System.out.println("值为3的元素前驱:"+arrayList.pre(3));
        System.out.println("值为3的元素的后继:"+arrayList.next(3));

        System.out.println("-------删除数据-------");
        arrayList.delete(0);
        System.out.println("线性表长度:"+arrayList.length());
        arrayList.display();
        arrayList.delete(arrayList.length()-1);
        System.out.println("线性表长度:"+arrayList.length());
        arrayList.display();

        System.out.println("-------清空线性表-------");
        arrayList.clear();
        System.out.println("线性表长度:"+arrayList.length());
        arrayList.display();

        System.out.println("-------判空线性表-------");
        System.out.println("线性表是否为空:"+arrayList.isEmpty());

    }

    public void testArrayList1(){
        System.out.println("-------初始化线性表-集合-------");
        ArrayList list1 = new ArrayList();
        list1.insert(0,5);
        list1.insert(0,4);
        list1.insert(0,3);
        list1.insert(0,2);
        list1.insert(0,1);
        list1.insert(0,0);

        ArrayList list2 = new ArrayList();
        list2.insert(0,8);
        list2.insert(0,7);
        list2.insert(0,6);
        list2.insert(0,5);
        list2.insert(0,4);
        list2.insert(0,3);

        System.out.println("-------显示线性表-集合-------");

        list1.display();
        list2.display();

        System.out.println("-------集合-------");
        list1.union(list2);
        list1.display();

        System.out.println("-------初始化线性表-有序合并--------");
        ArrayList list3 = new ArrayList();
        list3.insert(0,5);
        list3.insert(0,4);
        list3.insert(0,3);
        list3.insert(0,2);
        list3.insert(0,1);
        list3.insert(0,0);

        ArrayList list4 = new ArrayList();
        list4.insert(0,8);
        list4.insert(0,7);
        list4.insert(0,6);
        list4.insert(0,5);
        list4.insert(0,4);
        list4.insert(0,3);

        System.out.println("-------显示线性表-有序合并-------");

        list3.display();
        list2.display();

        System.out.println("-------有序合并-------");
        ArrayList listMerge = list3.merge(list4);
        listMerge.display();
    }
}
