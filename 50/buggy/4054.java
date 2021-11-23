@java.lang.Override
public java.util.Set<com.hazelcast.client.proxy.Entry<K, V>> entrySet() {
    return entrySet(TruePredicate.INSTANCE);
}