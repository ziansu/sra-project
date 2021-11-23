@java.lang.Override
public org.infinispan.commons.util.concurrent.NotifyingFuture<V> putAsync(K key, V value, org.infinispan.metadata.Metadata metadata) {
    org.infinispan.metadata.Metadata merged = applyDefaultMetadata(metadata);
    return putAsync(key, value, merged, null, null);
}