private boolean handleIntercept(android.view.MotionEvent event) {
    if (!(mCanIntercept)) {
        return false;
    }
    if (((mTouchedDotView) == null) || ((mTouchedDotView.getVisibility()) != (VISIBLE))) {
        return super.onInterceptTouchEvent(event);
    }
    initCircle();
    return true;
}