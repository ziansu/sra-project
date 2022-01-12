@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    mViewPager = ((android.support.v4.view.ViewPager) (findViewById(R.id.view_pager)));
    if ((mViewPager) != null) {
        setupViewPager(mViewPager);
    }
    android.support.design.widget.TabLayout tabLayout = ((android.support.design.widget.TabLayout) (findViewById(R.id.tab_layout)));
    tabLayout.setupWithViewPager(mViewPager);
}