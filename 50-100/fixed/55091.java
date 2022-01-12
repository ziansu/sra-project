@java.lang.Override
public V apply(final K k) {
    V loaded = null;
    try {
        if ((cacheLoader) != null) {
            cacheLoaderObserver.begin();
            loaded = cacheLoader.load(k);
            cacheLoaderObserver.end(CacheLoaderOutcome.SUCCESS);
        }
    } catch (java.lang.Exception e) {
        cacheLoaderObserver.end(CacheLoaderOutcome.FAILURE);
        throw newCacheLoaderException(e);
    }
    return loaded;
}