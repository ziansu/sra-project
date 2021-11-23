@java.lang.Override
public void commitBlock(long userId, long blockId) throws java.io.IOException {
    mEvictionLock.readLock().lock();
    tachyon.worker.block.meta.TempBlockMeta tempBlockMeta = mMetaManager.getTempBlockMeta(blockId);
    try {
        commitBlockNoLock(userId, blockId, tempBlockMeta);
        for (tachyon.worker.block.BlockStoreEventListener listener : mBlockStoreEventListeners) {
            listener.onCommitBlock(userId, blockId, tempBlockMeta.getBlockLocation());
        }
    } finally {
        mEvictionLock.readLock().unlock();
    }
}