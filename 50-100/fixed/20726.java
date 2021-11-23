@java.lang.Override
protected boolean onDown(@android.support.annotation.NonNull
android.view.MotionEvent e) {
    if ((mViewPager) == null) {
        return super.onDown(e);
    }
    mViewPager.requestDisallowInterceptTouchEvent(true);
    mIsSkipViewPager = false;
    mIsViewPagerInterceptedScroll = false;
    mIsScrollGestureDetected = false;
    mViewPagerX = computeInitialViewPagerScroll(e);
    mLastViewPagerEventX = e.getX();
    mViewPagerSkippedX = 0.0F;
    passEventToViewPager(e);
    super.onDown(e);
    return true;
}