private static void test(java.lang.reflect.Method t) {
    try {
        t.invoke(null);
        java.lang.System.out.println(("PASS:" + (t.getName())));
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(((("FAIL:" + (t.getName())) + ": ") + (e.getCause().getMessage())));
    }
}