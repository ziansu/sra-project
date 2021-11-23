@java.lang.Override
public void setRefreshing(boolean refreshing, boolean notify) {
    if ((mIsRefreshing) != refreshing) {
        super.mNotify = notify;
        mTarget.ensureTarget();
        super.mIsRefreshing = refreshing;
        if (mIsRefreshing) {
            mRefreshViewAnimate.setPercent((-1.0F), true);
            animateOffsetToCorrectPosition();
        }else {
            animateOffsetToStartPosition();
        }
    }
}