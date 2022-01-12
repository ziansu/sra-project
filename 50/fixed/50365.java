private boolean isLocalCache(java.lang.String cacheName, org.wso2.carbon.caching.impl.DistributedMapProvider distributedMapProvider) {
    return (cacheName.contains(CachingConstants.LOCAL_CACHE_PREFIX)) || (distributedMapProvider == null);
}