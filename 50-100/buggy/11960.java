static void invokeMethod(java.lang.Object object, java.lang.reflect.Method method, java.lang.Object... args) {
    try {
        if (method == null)
            return ;
        
        method.invoke(object, args);
    } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException ignored) {
        ignored.printStackTrace();
    }
}