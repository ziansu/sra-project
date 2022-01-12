@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setTitle("Dunia Film");
    mSectionsPagerAdapter = new id.sch.smktelkom_mlg.privateassignment.xirpl228.duniafilm.MainActivity.SectionsPagerAdapter(getSupportFragmentManager());
    mViewPager = ((android.support.v4.view.ViewPager) (findViewById(R.id.container)));
    mViewPager.setAdapter(mSectionsPagerAdapter);
    android.support.design.widget.TabLayout tabLayout = ((android.support.design.widget.TabLayout) (findViewById(R.id.tabs)));
    tabLayout.setupWithViewPager(mViewPager);
}