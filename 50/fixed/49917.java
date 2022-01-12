public static void assertFails(java.util.concurrent.Callable<?> c) {
    try {
        c.call();
    } catch (java.lang.Exception e) {
        return ;
    }
    throw new java.lang.RuntimeException("the call did not fail");
}