public void whenExist(com.a.eye.skywalking.api.plugin.interceptor.EnhancedClassInstanceContext context, java.lang.Runnable runnable) {
    if (!(context.isContain(invokeCounterKey))) {
        throw new com.a.eye.skywalking.api.plugin.interceptor.InterceptorException("key=invokeCounterKey not found is context. unexpected situation.");
    }
    int counter = context.get(invokeCounterKey, java.lang.Integer.class);
    if ((--counter) == 0) {
        runnable.run();
    }
    context.set(invokeCounterKey, counter);
}