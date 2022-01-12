private com.fwgg8547.opentest.Item createItem() {
    com.fwgg8547.opentest.Sprite s = new com.fwgg8547.opentest.Sprite(mIdOffset);
    com.fwgg8547.opentest.Item it = new com.fwgg8547.opentest.Item();
    it.mId = mIdOffset;
    it.mGroupId = 1;
    it.setSprite(s);
    it.setPosition(110.0F, 200.0F, 0.0F, 0.0F);
    try {
        mLock.writeLock();
        mBlocks.add(it);
        mGroup.add(it);
        mLock.writeUnlock();
    } catch (java.lang.Exception e) {
    }
    return it;
}