protected void delete(java.lang.String key) {
    try {
        memcachedClient.delete(key);
    } catch (java.util.concurrent.TimeoutException e) {
        info.noconfuse.modules.cache.MemcachedCache.LOGGER.error("Timeout when deleting data for key:{}", key, e);
    } catch (java.lang.InterruptedException e) {
        info.noconfuse.modules.cache.MemcachedCache.LOGGER.error("Interrupted when deleting data for key:{}", key, e);
    } catch (net.rubyeye.xmemcached.exception.MemcachedException e) {
        info.noconfuse.modules.cache.MemcachedCache.LOGGER.error("Failed when deleting data for key:{}", key, e);
    }
}