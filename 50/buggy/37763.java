@java.lang.Override
public void postRemoveBlock(long userId, long blockId) {
    synchronized(mLock) {
        removeBlockFromAddedBlocks(blockId);
        mRemovedBlocks.add(blockId);
    }
}