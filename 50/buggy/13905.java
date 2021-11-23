static final synchronized long storeClient(net.spy.memcached.MemcachedClient client) {
    long clientHandle = org.exist.xquery.modules.memcached.MemcachedModule.getHandle();
    org.exist.xquery.modules.memcached.MemcachedModule.clients.put(java.lang.Long.valueOf(clientHandle), client);
    return clientHandle;
}