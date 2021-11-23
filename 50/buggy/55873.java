public <K, V> org.vertx.java.core.spi.cluster.AsyncMultiMap<K, V> getAsyncMultiMap(final java.lang.String name) {
    org.vertx.java.spi.cluster.impl.hazelcast.MultiMap map = hazelcast.getMultiMap(name);
    return new org.vertx.java.spi.cluster.impl.hazelcast.HazelcastAsyncMultiMap(vertx, map);
}