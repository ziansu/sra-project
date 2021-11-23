@java.lang.Override
public org.aopalliance.aop.Advice getAdvice() {
    if ((interceptor) == null) {
        synchronized(this) {
            if ((interceptor) == null) {
                interceptor = new org.ironrhino.core.cache.CacheInterceptor();
                org.ironrhino.core.cache.CacheManager cacheManager = ctx.getBean(org.ironrhino.core.cache.CacheManager.class);
                interceptor.setCacheManager(cacheManager);
                interceptor.setMutex(mutex);
                interceptor.setMutexWait(mutexWait);
            }
        }
    }
    return interceptor;
}