@java.lang.Override
public void stop() throws javax.cache.CacheException {
    synchronized(status) {
        if (cacheConfiguration.isStatisticsEnabled()) {
            org.infinispan.jcache.util.JMXHelper.unregisterStatisticsMBean(cacheManager.getName(), getName());
        }
        cache.clear();
        cache.stop();
        status = javax.cache.Status.STOPPED;
    }
}