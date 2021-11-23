@java.lang.Override
public void initStore(org.ehcache.spi.cache.Store<?, ?> resource) {
    java.util.Map.Entry<org.ehcache.spi.cache.tiering.CachingTier.Provider, org.ehcache.spi.cache.tiering.AuthoritativeTier.Provider> entry = providersMap.get(resource);
    if (entry == null) {
        throw new java.lang.IllegalArgumentException(("Given store is not managed by this provider : " + resource));
    }
    org.ehcache.internal.store.tiering.CacheStore cacheStore = ((org.ehcache.internal.store.tiering.CacheStore) (resource));
    entry.getKey().initCachingTier(cacheStore.cachingTier);
    entry.getValue().initAuthoritativeTier(cacheStore.authoritativeTier);
}