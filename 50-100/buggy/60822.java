void shutdown(final org.ehcache.jcache.JCacheManager jCacheManager) {
    synchronized(cacheManagers) {
        final java.util.concurrent.ConcurrentMap<java.net.URI, org.ehcache.jcache.JCacheManager> map = cacheManagers.get(jCacheManager.getClassLoader());
        if ((map.remove(jCacheManager.getURI())) != null) {
            jCacheManager.shutdown();
        }
    }
}