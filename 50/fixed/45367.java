private java.util.concurrent.BlockingQueue<org.apache.blur.store.blockcache_v2.CacheValue> getPool(int cacheBlockSize) {
    java.util.concurrent.BlockingQueue<org.apache.blur.store.blockcache_v2.CacheValue> blockingQueue = _cacheValuePool.get(cacheBlockSize);
    if (blockingQueue == null) {
        blockingQueue = buildNewBlockQueue(cacheBlockSize);
    }
    return blockingQueue;
}