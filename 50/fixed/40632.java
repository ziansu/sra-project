public void stopScroll() {
    getHandler().removeCallbacks(mScrollRunnable);
    mScrollRunnable = null;
    mIsScrolling = false;
}