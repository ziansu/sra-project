@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void test_getElementByOversizedIndex() throws java.lang.Exception {
    list.addFirst(2);
    list.addFirst(1);
    list.addFirst(0);
    list.get(3);
}