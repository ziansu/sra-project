@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    if (savedInstanceState == null) {
        getSupportActionBar().hide();
        mViewPager = ((android.support.v4.view.ViewPager) (findViewById(R.id.viewpager)));
        mViewPager.setAdapter(new ladsoft.roulette.adapter.SlidingTabsFragmentAdapter(getSupportFragmentManager(), this));
        mSlidingTabLayout = ((view.SlidingTabLayout) (findViewById(R.id.sliding_tabs)));
        mSlidingTabLayout.setDistributeEvenly(true);
        mSlidingTabLayout.setViewPager(mViewPager);
    }
}