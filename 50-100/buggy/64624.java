@java.lang.Override
public void onStopNestedScroll(android.view.View target) {
    mNestedScrollingParentHelper.onStopNestedScroll(target);
    if (mNestedScrollInProgress) {
        mIndicator.onFingerUp();
    }
    if (mIndicator.hasLeftStartPosition()) {
        onFingerUp(false);
    }else {
        notifyFingerUp();
    }
    mNestedScrollInProgress = false;
    mTotalRefreshingUnconsumed = 0;
    mTotalRefreshingConsumed = 0;
    mTotalLoadMoreUnconsumed = 0;
    mTotalLoadMoreConsumed = 0;
    stopNestedScroll();
}