@java.lang.Override
public org.aopalliance.aop.Advice getAdvice() {
    if ((interceptor) == null) {
        synchronized(this) {
            if ((interceptor) == null) {
                org.ironrhino.core.cache.CacheInterceptor temp = new org.ironrhino.core.cache.CacheInterceptor();
                org.ironrhino.core.cache.CacheManager cacheManager = ctx.getBean(org.ironrhino.core.cache.CacheManager.class);
                temp.setCacheManager(cacheManager);
                temp.setMutex(mutex);
                temp.setMutexWait(mutexWait);
                interceptor = temp;
            }
        }
    }
    return interceptor;
}