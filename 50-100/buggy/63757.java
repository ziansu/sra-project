@java.lang.Override
public boolean beforeInvoke(java.lang.Object target, java.lang.reflect.Method method, java.lang.Object... args) {
    java.util.Iterator<com.zhizus.forest.core.interceptor.InvokerInterceptor> iterator = interceptors.iterator();
    boolean noInterrupt = true;
    while ((iterator.hasNext()) && true) {
        noInterrupt = iterator.next().beforeInvoke(target, method, args);
    } 
    return noInterrupt;
}