@java.lang.Override
public net.spy.memcached.internal.CollectionFuture<java.lang.Long> asyncBopDecr(java.lang.String key, long subkey, int by) {
    return this.getClient().asyncBopIncr(key, subkey, by);
}