@org.junit.Test
public void testFind() {
    org.junit.Assert.assertEquals(null, doubleLinkedList.find(1));
    doubleLinkedList.insertHead(1);
    doubleLinkedList.insertTail(3);
    doubleLinkedList.insertHead(2);
    org.junit.Assert.assertEquals(3, doubleLinkedList.getSize());
    org.junit.Assert.assertEquals(1, doubleLinkedList.find(1).getId());
}