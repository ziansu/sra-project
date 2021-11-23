public void increaseCachedValue(int entry) {
    int blocknumber = entry / (dk.egense.math.distributions.WrappedStreamedBlockPacker.BLOCK_SIZE);
    int nextCacheEntry = blockCacheCount[blocknumber];
    blockCache[blocknumber][nextCacheEntry] = entry;
    blockCacheCount[blocknumber] = ++nextCacheEntry;
    java.lang.System.out.println(((((("entry:" + entry) + " for block:") + blocknumber) + " block cache entry") + nextCacheEntry));
    if (nextCacheEntry == (dk.egense.math.distributions.WrappedStreamedBlockPacker.BLOCK_FLUSH_SIZE)) {
        flushCacheBlock(blocknumber);
    }
}