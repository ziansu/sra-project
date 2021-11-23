@java.lang.Override
public void onStopNestedScroll(android.view.View target) {
    mNestedScrollingParentHelper.onStopNestedScroll(target);
    if (mNestedScrollInProgress) {
        mIndicator.onFingerUp();
    }
    mNestedScrollInProgress = false;
    if (mIndicator.hasLeftStartPosition()) {
        onFingerUp(false);
    }else {
        notifyFingerUp();
    }
    mTotalRefreshingUnconsumed = 0;
    mTotalRefreshingConsumed = 0;
    mTotalLoadMoreUnconsumed = 0;
    mTotalLoadMoreConsumed = 0;
    stopNestedScroll();
}