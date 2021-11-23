@org.junit.Test
public void test_removeLast() throws java.lang.Exception {
    list.addFirst(1);
    list.addFirst(2);
    list.addLast(3);
    list.removeFirst();
    org.junit.Assert.assertTrue(((list.size()) == 2));
}