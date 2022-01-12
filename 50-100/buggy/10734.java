public static java.lang.Object invokeMethod(java.lang.reflect.Method method, java.lang.Object object, java.lang.Object... args) {
    try {
        boolean a = !(method.isAccessible());
        if (!(method.isAccessible())) {
            method.setAccessible(true);
        }
        java.lang.Object obj = method.invoke(object, args);
        if (a) {
            method.setAccessible(false);
        }
        return obj;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return null;
    }
}