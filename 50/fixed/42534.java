@java.lang.Override
public net.spy.memcached.internal.CollectionFuture<java.lang.Long> asyncBopDecr(java.lang.String key, byte[] subkey, int by) {
    return this.getClient().asyncBopDecr(key, subkey, by);
}