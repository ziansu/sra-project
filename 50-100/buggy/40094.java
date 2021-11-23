private static <T> void invokePostConstruct(T target) {
    java.util.List<java.lang.reflect.Method> methods = org.rapidoid.cls.Cls.getMethodsAnnotated(target.getClass(), org.rapidoid.annotation.Init.class);
    for (java.lang.reflect.Method method : methods) {
        org.rapidoid.cls.Cls.invoke(null, method, target);
    }
}