private void updateNativeViewConfigurationIfNecessary() {
    android.view.ViewConfiguration configuration = android.view.ViewConfiguration.get(mAppContext);
    if ((mViewConfiguration) == configuration) {
        assert (mDensity) == (mAppContext.getResources().getDisplayMetrics().density);
        return ;
    }
    mViewConfiguration = configuration;
    mDensity = mAppContext.getResources().getDisplayMetrics().density;
    assert (mDensity) > 0;
    nativeUpdateSharedViewConfiguration(getMaximumFlingVelocity(), getMinimumFlingVelocity(), getTouchSlop(), getDoubleTapSlop(), getMinScalingSpan(), getMinScalingTouchMajor());
}