@java.lang.SuppressWarnings(value = "unchecked")
public <T> T create(java.lang.Class<T> service) {
    return ((T) (java.lang.reflect.Proxy.newProxyInstance(service.getClassLoader(), new java.lang.Class<?>[]{ service }, new spwrap.proxy.CallerInvocationHandler(this))));
}