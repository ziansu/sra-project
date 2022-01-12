private void cancelScrollAnimation() {
    removeCallbacks(mScrollRunnable);
    mScrollRunnable = null;
    if (!(mScroller.isFinished())) {
        mScroller.abortAnimation();
    }
}