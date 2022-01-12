private void setTargetOffsetTopAndBottom(int offset, boolean requiresUpdate) {
    mCircleView.bringToFront();
    mCircleView.offsetTopAndBottom(offset);
    mCurrentTargetOffsetTop = mCircleView.getTop();
    if (requiresUpdate && ((android.os.Build.VERSION.SDK_INT) < 11)) {
        invalidate();
    }
}