private void init(android.content.Context context) {
    mScaleTouchSlop = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
    mScreenW = getResources().getDisplayMetrics().widthPixels;
    mMaxVelocity = android.view.ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    mLastPoint = new android.graphics.PointF();
}