@java.lang.Override
public <T> net.spy.memcached.internal.CollectionFuture<java.util.Map<java.lang.String, T>> asyncMopGet(java.lang.String key, boolean withDelete, boolean dropIfEmpty, net.spy.memcached.transcoders.Transcoder<T> tc) {
    java.util.List<java.lang.String> mkeyList = new java.util.ArrayList<java.lang.String>();
    net.spy.memcached.collection.MapGet get = new net.spy.memcached.collection.MapGet(mkeyList, withDelete, dropIfEmpty);
    return asyncMopGet(key, get, tc);
}