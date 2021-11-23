public void smoothCloseMenu(int duration) {
    mCurrentSwiper.autoCloseMenu(mScroller, getScrollX(), duration);
    invalidate();
    mCurrentSwiper = null;
}