public void setViewPager(android.support.v4.view.ViewPager mViewPager) {
    this.mViewPager = mViewPager;
    android.support.v4.view.PagerAdapter mPagerAdapter = mViewPager.getAdapter();
    if (null == mPagerAdapter)
        throw new java.lang.IllegalStateException("have not set the adapter");
    
    this.mIndicatorCount = mPagerAdapter.getCount();
    initViews();
    initListeners();
}