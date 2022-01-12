@org.junit.Test
public void test_removeObject() throws java.lang.Exception {
    com.eagulyi.interview.datastructures.MyLinkedList<java.lang.Integer> linkedList = new com.eagulyi.interview.datastructures.MyLinkedList();
    linkedList.addFirst(1);
    linkedList.addLast(2);
    linkedList.addLast(3);
    linkedList.addLast(4);
    linkedList.addLast(2);
    linkedList.remove(2);
    org.junit.Assert.assertTrue(((linkedList.size()) == 3));
}