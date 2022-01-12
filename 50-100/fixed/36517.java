private void handleActionUp() {
    if ((mMoveDistance) < 0) {
        scrollBy(((int) (-(mMoveDistance))), 0);
        mMoveDistance = 0;
    }
    if ((mMoveDistance) > (mTotalWidth)) {
        scrollBy(((int) (-((mMoveDistance) - (mTotalWidth)))), 0);
        mMoveDistance = mTotalWidth;
    }
    if ((mOnSizeChangeListener) != null) {
        onSizeChange();
    }
    mMoveOffset = 0;
    mPrevMovePos = 0;
}