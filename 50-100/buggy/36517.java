private void handleActionUp() {
    if ((mMoveDistance) < 0) {
        scrollBy(((int) (-(mMoveDistance))), 0);
        mMoveDistance = 0;
    }
    if ((mMoveDistance) > (mTotalWidth)) {
        scrollBy(((int) (-((mMoveDistance) - (mTotalWidth)))), 0);
        mMoveDistance = mTotalWidth;
    }
    mPrevMovePos = 0;
    mMoveOffset = 0;
    if ((mOnSizeChangeListener) != null) {
        onSizeChange();
    }
}