@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void test_getElementByOversizedIndex() throws java.lang.Exception {
    com.eagulyi.interview.datastructures.MyLinkedList<java.lang.Integer> linkedList = new com.eagulyi.interview.datastructures.MyLinkedList();
    linkedList.addFirst(2);
    linkedList.addFirst(1);
    linkedList.addFirst(0);
    linkedList.get(3);
}