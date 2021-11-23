public static void shutdownGlobalCache() {
    if (((com.runwaysdk.dataaccess.cache.ObjectCache.globalCache) == null) || (!(com.runwaysdk.dataaccess.cache.ObjectCache.globalCache.isCacheInitialized()))) {
        com.runwaysdk.dataaccess.cache.ObjectCache.logger.warn("We were told to shutdown the global cache, but it was not initialized. This is only a problem if the application subsequently hangs.");
        return ;
    }
    if (!(com.runwaysdk.dataaccess.cache.ObjectCache.globalCache.isEmpty())) {
        com.runwaysdk.dataaccess.cache.ObjectCache.globalCache.backupCollectionClasses(com.runwaysdk.dataaccess.cache.ObjectCache.strategyMap);
    }
    com.runwaysdk.dataaccess.cache.ObjectCache.globalCache.shutdown();
    com.runwaysdk.dataaccess.cache.ObjectCache.initialized = false;
}