@org.junit.Test
public void testFind() {
    assertEquals(null, doubleLinkedList.find(1));
    doubleLinkedList.insertHead(1);
    doubleLinkedList.insertTail(3);
    doubleLinkedList.insertHead(2);
    assertEquals(3, doubleLinkedList.getSize());
    assertEquals(1, doubleLinkedList.find(1).getId());
}