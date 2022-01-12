@org.junit.Test
public void test_firstLastLinking() throws java.lang.Exception {
    com.eagulyi.interview.datastructures.MyLinkedList<java.lang.Integer> linkedList = new com.eagulyi.interview.datastructures.MyLinkedList();
    linkedList.addFirst(3);
    linkedList.addLast(4);
    linkedList.addFirst(2);
    linkedList.addLast(5);
    linkedList.addLast(6);
    linkedList.addFirst(1);
    org.junit.Assert.assertTrue(((linkedList.size()) == 6));
}