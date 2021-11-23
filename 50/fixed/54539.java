public static synchronized com.flipkart.perf.server.cache.LibCache initialize(com.flipkart.perf.server.config.ResourceStorageFSConfig storageConfig) throws java.io.IOException {
    if ((com.flipkart.perf.server.cache.LibCache.self) == null) {
        com.flipkart.perf.server.cache.LibCache.self = new com.flipkart.perf.server.cache.LibCache(storageConfig);
    }
    return com.flipkart.perf.server.cache.LibCache.self;
}