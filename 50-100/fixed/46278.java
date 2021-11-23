private <T> T getCachedValue(final de.tse.simplerestfacade.invocation.MethodCall methodCall, final java.lang.String key, final de.tse.simplerestfacade.methodinformation.cache.CacheCallback<T> callback) {
    rwLock.readLock().lock();
    try {
        if (valueIsCached(methodCall, key)) {
            return getValueFromCache(methodCall, key);
        }
    } finally {
        rwLock.readLock().unlock();
    }
    return createCachedValue(methodCall, key, callback);
}