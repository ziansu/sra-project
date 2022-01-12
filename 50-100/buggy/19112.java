@org.junit.Test
public void test() {
    main.linked_lists.HLinkedList list = new main.linked_lists.HLinkedList();
    list.add(4);
    list.add(5);
    list.add(9);
    java.lang.System.out.println(list.toString());
    java.lang.System.out.println("ddd");
    main.linked_lists.MyStack ms = new main.linked_lists.MyStack();
    ms.push(4);
    ms.push(7);
    ms.push(8);
    java.lang.System.out.println(ms.toString());
}