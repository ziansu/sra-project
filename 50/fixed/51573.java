@org.junit.Test
public void testSizeEqual0() throws java.lang.Exception {
    try {
        q = new CircularQueue<java.lang.Integer>(0);
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e);
    }
}