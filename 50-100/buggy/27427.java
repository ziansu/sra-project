@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.support.v4.view.ViewPager viewPager = ((android.support.v4.view.ViewPager) (findViewById(R.id.pager)));
    android.support.v4.view.PagerAdapter pagerAdapter = new com.example.zhangfan.tourguide.MainPagerAdapter(getSupportFragmentManager());
    viewPager.setAdapter(pagerAdapter);
    android.support.design.widget.TabLayout tabLayout = ((android.support.design.widget.TabLayout) (findViewById(R.id.tabs)));
    tabLayout.setupWithViewPager(viewPager);
}