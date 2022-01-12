@java.lang.Override
protected void onSizeChanged(int width, int height, int oldWidth, int oldHeight) {
    int adjustedWidth = (width - (getPaddingLeft())) - (getPaddingRight());
    mViewWidth = adjustedWidth / ((float) (com.andrognito.patternlockview.PatternLockView.sDotCount));
    int adjustedHeight = (height - (getPaddingTop())) - (getPaddingBottom());
    mViewHeight = adjustedHeight / ((float) (com.andrognito.patternlockview.PatternLockView.sDotCount));
}