public void stopScroll() {
    getHandler().removeCallbacks(mScrollRunnable);
    mScrollRunnable = null;
    mItemLargeIndex = mDestItemLargeIndex;
    mIsScrolling = false;
}