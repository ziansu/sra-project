private void setTargetOffsetTopAndBottom(int offset, boolean requiresUpdate) {
    mCircleView.bringToFront();
    mCircleView.offsetTopAndBottom(offset);
    switch (mDirection) {
        case BOTTOM :
            mCurrentTargetOffsetTop = (getMeasuredHeight()) - (mCircleView.getMeasuredHeight());
            break;
        case TOP :
        default :
            mCurrentTargetOffsetTop = mCircleView.getTop();
            break;
    }
    if (requiresUpdate && ((android.os.Build.VERSION.SDK_INT) < 11)) {
        invalidate();
    }
}