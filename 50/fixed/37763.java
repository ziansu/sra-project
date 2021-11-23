@java.lang.Override
public void postRemoveBlock(long userId, long blockId) {
    synchronized(mLock) {
        removeBlockFromAddedBlocks(blockId);
        if (!(mRemovedBlocks.contains(blockId))) {
            mRemovedBlocks.add(blockId);
        }
    }
}