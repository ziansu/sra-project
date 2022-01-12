public static void refreshCache() {
    com.runwaysdk.dataaccess.cache.ObjectCache.initialized = false;
    com.runwaysdk.dataaccess.cache.ObjectCache.globalCache.removeAll();
}