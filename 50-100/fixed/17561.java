public void increaseCachedValue(int entry) {
    int blocknumber = entry / (dk.egense.math.distributions.WrappedStreamedBlockPacker.BLOCK_SIZE);
    int nextCacheEntry = blockCacheCount[blocknumber];
    blockCache[blocknumber][nextCacheEntry] = entry;
    blockCacheCount[blocknumber] = ++nextCacheEntry;
    if (nextCacheEntry == (dk.egense.math.distributions.WrappedStreamedBlockPacker.BLOCK_FLUSH_SIZE)) {
        flushCacheBlock(blocknumber);
    }
}