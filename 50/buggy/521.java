@java.lang.Override
public com.hazelcast.core.ICompletableFuture<V> getAsync(K key) {
    return new com.hazelcast.internal.adapter.SimpleCompletedFuture<V>(cache.get(key));
}