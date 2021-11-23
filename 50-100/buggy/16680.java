protected void save(java.lang.String key, java.lang.Object value) {
    try {
        memcachedClient.set(genKey(key), 0, value);
    } catch (java.util.concurrent.TimeoutException e) {
        info.noconfuse.modules.cache.MemcachedCache.LOGGER.error("Timeout when caching data for key:{}", key, e);
    } catch (java.lang.InterruptedException e) {
        info.noconfuse.modules.cache.MemcachedCache.LOGGER.error("Interrupted when caching data for key:{}", key, e);
    } catch (net.rubyeye.xmemcached.exception.MemcachedException e) {
        info.noconfuse.modules.cache.MemcachedCache.LOGGER.error("Failed when caching data for key:{}", key, e);
    }
}