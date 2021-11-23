@org.junit.Test
public void test_firstLastLinking() throws java.lang.Exception {
    list.addFirst(3);
    list.addLast(4);
    list.addFirst(2);
    list.addLast(5);
    list.addLast(6);
    list.addFirst(1);
    org.junit.Assert.assertTrue(((list.size()) == 6));
}