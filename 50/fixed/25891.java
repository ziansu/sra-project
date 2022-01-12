protected com.hazelcast.config.NearCacheConfig newInvalidationEnabledNearCacheConfig() {
    com.hazelcast.config.NearCacheConfig nearCacheConfig = newNearCacheConfig();
    nearCacheConfig.setInvalidateOnChange(true);
    return nearCacheConfig;
}