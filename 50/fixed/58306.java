@java.lang.Override
protected void onDetachedFromWindow() {
    if ((mViewPager) != null)
        mViewPager.removeOnPageChangeListener(this);
    
    super.onDetachedFromWindow();
}