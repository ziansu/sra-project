@java.lang.SuppressWarnings(value = "unchecked")
public static <T> T wrapWithInvocationHandler(java.lang.Class<T> interfaceType, java.lang.reflect.InvocationHandler invocationHandler) {
    try {
        java.lang.ClassLoader classLoader = java.lang.Thread.currentThread().getContextClassLoader();
        return ((T) (java.lang.reflect.Proxy.newProxyInstance(classLoader, new java.lang.Class[]{ interfaceType }, invocationHandler)));
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e);
    }
}