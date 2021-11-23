private void init(android.content.Context context) {
    mScaleTouchSlop = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
    mMaxVelocity = android.view.ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    mScreenW = getResources().getDisplayMetrics().widthPixels;
    mLastPoint = new android.graphics.PointF();
}