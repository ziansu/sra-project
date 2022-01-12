private K getOnlyKey(org.ehcache.spi.cache.Store.Iterator<org.ehcache.Cache.Entry<K, org.ehcache.spi.cache.Store.ValueHolder<V>>> iter) throws org.ehcache.exceptions.CacheAccessException {
    java.util.Map<K, V> map = new java.util.HashMap<K, V>();
    while (iter.hasNext()) {
        org.ehcache.Cache.Entry<K, org.ehcache.spi.cache.Store.ValueHolder<V>> entry = iter.next();
        return entry.getKey();
    } 
    return null;
}