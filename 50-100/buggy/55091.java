@java.lang.Override
public V apply(final K k) {
    V loaded = null;
    try {
        if ((cacheLoader) != null) {
            cacheLoaderObserver.begin();
            loaded = cacheLoader.load(k);
            cacheLoaderObserver.end(CacheLoaderOutcome.SUCCESS);
            getObserver.end((loaded != null ? org.ehcache.statistics.CacheOperationOutcomes.GetOutcome.HIT_WITH_LOADER : org.ehcache.statistics.CacheOperationOutcomes.GetOutcome.MISS_WITH_LOADER));
        }
    } catch (java.lang.Exception e) {
        cacheLoaderObserver.end(CacheLoaderOutcome.FAILURE);
        throw newCacheLoaderException(e);
    }
    return loaded;
}