@java.lang.Override
protected void onExpandingFinished() {
    super.onExpandingFinished();
    mNotificationStackScroller.onExpansionStopped();
    mIsExpanding = false;
    mScrollYOverride = -1;
    if ((mExpandedHeight) == 0.0F) {
        setListening(false);
    }else {
        setListening(true);
    }
    mTwoFingerQsExpand = false;
    mTwoFingerQsExpandPossible = false;
}