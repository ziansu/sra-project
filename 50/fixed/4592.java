private T generateDynamicWrapper(C menuContext) {
    return ((T) (java.lang.reflect.Proxy.newProxyInstance(this.getClass().getClassLoader(), new java.lang.Class[]{ interfaceClass }, getInvocationHandler(menuContext))));
}