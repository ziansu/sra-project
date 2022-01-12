@java.lang.Override
public org.infinispan.commons.util.concurrent.NotifyingFuture<V> putAsync(K key, V value, org.infinispan.metadata.Metadata metadata) {
    return putAsync(key, value, metadata, null, null);
}