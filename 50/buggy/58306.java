@java.lang.Override
protected void onDetachedFromWindow() {
    mViewPager.removeOnPageChangeListener(this);
    super.onDetachedFromWindow();
}