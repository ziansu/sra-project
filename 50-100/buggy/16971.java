@java.lang.SuppressWarnings(value = "unchecked")
public static <T, U extends T> U wrapWithInvocationHandler(java.lang.Class<T> interfaceType, java.lang.reflect.InvocationHandler invocationHandler) {
    try {
        java.lang.ClassLoader classLoader = java.lang.Thread.currentThread().getContextClassLoader();
        return ((U) (java.lang.reflect.Proxy.newProxyInstance(classLoader, new java.lang.Class[]{ interfaceType }, invocationHandler)));
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e);
    }
}