@java.lang.Override
public V put(K key, V value, org.infinispan.metadata.Metadata metadata) {
    return put(key, value, metadata, null, null);
}