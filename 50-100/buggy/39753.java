public static void main(java.lang.String[] argv) {
    hgtest.mjsonapp.JsonStorageTests test = new hgtest.mjsonapp.JsonStorageTests();
    try {
        test.setUp();
        test.testAddEntity();
        java.lang.System.out.println("test passed successfully");
    } catch (java.lang.Throwable t) {
        t.printStackTrace(java.lang.System.err);
    } finally {
        test.tearDown();
    }
}