public static com.flipkart.perf.server.cache.LibCache initialize(com.flipkart.perf.server.config.ResourceStorageFSConfig storageConfig) throws java.io.IOException {
    if ((com.flipkart.perf.server.cache.LibCache.self) == null) {
        synchronized(com.flipkart.perf.server.cache.LibCache.self) {
            com.flipkart.perf.server.cache.LibCache.self = new com.flipkart.perf.server.cache.LibCache(storageConfig);
        }
    }
    return com.flipkart.perf.server.cache.LibCache.self;
}