@org.junit.Test
public void testAddFirst() throws java.lang.Exception {
    deque.addFirst(1);
    java.lang.Integer first = deque.removeFirst();
    assertSame("should be same", 1, first);
}