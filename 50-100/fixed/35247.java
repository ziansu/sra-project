@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.layout_main);
    mViewPager = ((android.support.v4.view.ViewPager) (findViewById(R.id.container)));
    mSectionsPagerAdapter = new ua.org.shutl.buoyviewer.adapter.SectionsPagerAdapter(getSupportFragmentManager(), mViewPager, this);
    mSectionsPagerAdapter.showLocationItemRootList();
}