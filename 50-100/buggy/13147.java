@org.junit.Test
public void test_removeLast() throws java.lang.Exception {
    com.eagulyi.interview.datastructures.MyLinkedList<java.lang.Integer> linkedList = new com.eagulyi.interview.datastructures.MyLinkedList();
    linkedList.addFirst(1);
    linkedList.addFirst(2);
    linkedList.addLast(3);
    linkedList.removeFirst();
    org.junit.Assert.assertTrue(((linkedList.size()) == 2));
}