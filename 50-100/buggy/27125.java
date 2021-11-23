@java.lang.Override
public javax.cache.Cache.Entry<K, V> next() {
    if (!(hasNext())) {
        throw new java.util.NoSuchElementException();
    }
    currentIndex = index;
    (index)++;
    final com.hazelcast.nio.serialization.Data keyData = result.getKey(currentIndex);
    final K key = toObject(keyData);
    final V value = cache.get(key);
    return new com.hazelcast.cache.impl.CacheEntry<K, V>(key, value);
}