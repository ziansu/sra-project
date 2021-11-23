private static java.util.List<java.lang.reflect.Method> getAllDeclaredMethods(java.lang.Class<?> c) {
    java.util.List<java.lang.reflect.Method> l = new java.util.ArrayList<>();
    while ((c != null) && (c != (java.lang.Object.class))) {
        l.addAll(java.security.AccessController.doPrivileged(org.glassfish.jersey.internal.util.ReflectionHelper.getDeclaredMethodsPA(c)));
        c = c.getSuperclass();
    } 
    return l;
}