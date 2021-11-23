static final synchronized net.spy.memcached.MemcachedClient retrieveClient(final long clientHandle) {
    return org.exist.xquery.modules.memcached.MemcachedModule.clients.get(java.lang.Long.valueOf(clientHandle));
}