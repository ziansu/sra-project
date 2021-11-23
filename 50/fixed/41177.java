@java.lang.Override
public void callback(java.util.Set<java.lang.String> response) {
    try {
        assertEquals(set, response);
        finishTest();
    } catch (java.lang.Throwable e) {
        e.printStackTrace();
        fail();
    }
}