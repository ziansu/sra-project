static final synchronized long storeClient(final net.spy.memcached.MemcachedClient client) {
    final long clientHandle = org.exist.xquery.modules.memcached.MemcachedModule.getHandle();
    org.exist.xquery.modules.memcached.MemcachedModule.clients.put(java.lang.Long.valueOf(clientHandle), client);
    return clientHandle;
}