@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    mViewPager = ((android.support.v4.view.ViewPager) (view.findViewById(R.id.viewpager)));
    mPageAdapter = new com.av.dev.pyurluxuryandroid.Fragment.LifestyleManager.RequestLifestyleFragment.SectionsPagerAdapter();
    mViewPager.setAdapter(mPageAdapter);
    mViewPager.setCurrentItem(0);
    mSlidingTabLayout = ((com.av.dev.pyurluxuryandroid.View.SlidingTabLayout) (view.findViewById(R.id.sliding_tabs)));
    mSlidingTabLayout.setRowCount(2);
    mSlidingTabLayout.setViewPager(mViewPager);
    mSlidingTabLayout.setOnPageChangeListener(pageListener);
}