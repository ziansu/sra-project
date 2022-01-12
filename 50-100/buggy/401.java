@org.springframework.context.annotation.Bean
public org.springframework.cache.CacheManager cacheManager() {
    org.springframework.cache.support.SimpleCacheManager simpleCacheManager = new org.springframework.cache.support.SimpleCacheManager();
    org.springframework.cache.guava.GuavaCache referenceDataCache = new org.springframework.cache.guava.GuavaCache(lv.tsi.calendar.config.CacheConfiguration.REFERENCE_DATA_CACHE, com.google.common.cache.CacheBuilder.newBuilder().maximumSize(45).expireAfterWrite(24, java.util.concurrent.TimeUnit.HOURS).build());
    org.springframework.cache.guava.GuavaCache eventsCache = new org.springframework.cache.guava.GuavaCache(lv.tsi.calendar.config.CacheConfiguration.EVENTS_CACHE, com.google.common.cache.CacheBuilder.newBuilder().maximumSize(663).expireAfterAccess(24, java.util.concurrent.TimeUnit.HOURS).build());
    simpleCacheManager.setCaches(java.util.Arrays.asList(referenceDataCache, eventsCache));
    return simpleCacheManager;
}