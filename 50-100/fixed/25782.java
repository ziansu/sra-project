@org.junit.Test
public void test_removeObject() throws java.lang.Exception {
    list.addFirst(1);
    list.addLast(2);
    list.addLast(3);
    list.addLast(4);
    list.addLast(2);
    list.remove(2);
    org.junit.Assert.assertTrue(((list.size()) == 3));
}