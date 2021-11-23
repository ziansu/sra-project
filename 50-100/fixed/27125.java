@java.lang.Override
public javax.cache.Cache.Entry<K, V> next() {
    while (hasNext()) {
        currentIndex = index;
        (index)++;
        final com.hazelcast.nio.serialization.Data keyData = result.getKey(currentIndex);
        final K key = toObject(keyData);
        final V value = cache.get(key);
        if (value != null) {
            return new com.hazelcast.cache.impl.CacheEntry<K, V>(key, value);
        }
    } 
    throw new java.util.NoSuchElementException();
}