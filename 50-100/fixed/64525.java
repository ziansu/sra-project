@java.lang.Override
public boolean afterInvoke(java.lang.Object target, java.lang.reflect.Method method, java.lang.Object result) {
    java.util.Iterator<com.zhizus.forest.core.interceptor.InvokerInterceptor> iterator = interceptors.iterator();
    boolean noInterrupt = true;
    while ((iterator.hasNext()) && noInterrupt) {
        noInterrupt = iterator.next().afterInvoke(target, method, result);
    } 
    return noInterrupt;
}