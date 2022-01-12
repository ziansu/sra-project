public void setViewPager(@android.support.annotation.NonNull
android.support.v4.view.ViewPager mViewPager) {
    this.mViewPager = mViewPager;
    android.support.v4.view.PagerAdapter mPagerAdapter = mViewPager.getAdapter();
    if (null != mPagerAdapter) {
        this.mIndicatorCount = mPagerAdapter.getCount();
        initViews();
        initListeners();
    }
}