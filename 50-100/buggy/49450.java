@java.lang.SuppressWarnings(value = "unchecked")
public static <T> T createProxy(final java.lang.Class<?> targetClass, final java.util.List<org.smart4j.framework.proxy.Proxy> proxyList) {
    return (T) > (net.sf.cglib.proxy.Enhancer.create(targetClass, new net.sf.cglib.proxy.MethodInterceptor() {
        @java.lang.Override
        public java.lang.Object intercept(java.lang.Object targetObject, java.lang.reflect.Method targetMethod, java.lang.Object[] methodParams, net.sf.cglib.proxy.MethodProxy methodProxy) throws java.lang.Throwable {
            return new org.smart4j.framework.proxy.ProxyChain(targetClass, targetObject, targetMethod, methodProxy, methodParams, proxyList).doProxyChain();
        }
    }));
}