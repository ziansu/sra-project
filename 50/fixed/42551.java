public boolean removeBlockMeta(tachyon.worker.block.meta.BlockMeta block) {
    com.google.common.base.Preconditions.checkNotNull(block);
    mBlockIdToBlockMap.remove(block.getBlockId());
    mAvailableBytes += block.getBlockSize();
    return true;
}