public void whenEnter(com.a.eye.skywalking.api.plugin.interceptor.EnhancedClassInstanceContext context, java.lang.Runnable runnable) {
    if (!(context.isContain(invokeCounterKey))) {
        synchronized(invokeCounterInstLock) {
            if (!(context.isContain(invokeCounterKey))) {
                context.set(invokeCounterKey, 0);
            }
        }
    }
    int counter = context.get(invokeCounterKey, java.lang.Integer.class);
    if ((++counter) == 1) {
        runnable.run();
    }
}