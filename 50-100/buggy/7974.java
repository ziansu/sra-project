@org.springframework.context.annotation.Bean
public org.springframework.cache.guava.GuavaCacheManager getCacheManager() {
    org.springframework.cache.guava.GuavaCacheManager gcm = new org.springframework.cache.guava.GuavaCacheManager();
    gcm.setAllowNullValues(false);
    com.google.common.cache.CacheBuilder<java.lang.Object, java.lang.Object> builder = com.google.common.cache.CacheBuilder.newBuilder();
    builder.concurrencyLevel(16);
    builder.expireAfterAccess(15, java.util.concurrent.TimeUnit.MINUTES);
    builder.initialCapacity(256);
    builder.maximumWeight(getMaxMemory());
    builder.weigher(new fi.phz.cib.WebApplicationConfiguration.ByteSizeWeight());
    gcm.setCacheBuilder(builder);
    return gcm;
}