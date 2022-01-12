@java.lang.Override
public com.hazelcast.core.ICompletableFuture<V> getAsync(K key) {
    return cache.getAsync(key);
}