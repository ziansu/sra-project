@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.homepage_layout);
    android.support.v4.view.ViewPager viewPager = ((android.support.v4.view.ViewPager) (findViewById(R.id.viewPager)));
    viewPager.setAdapter(new com.example.user.newcoffeepuzzle.hompage.HomePageActivity.MyPagerAdapter(getSupportFragmentManager()));
    android.support.design.widget.TabLayout tabLayout = ((android.support.design.widget.TabLayout) (findViewById(R.id.Tab)));
    tabLayout.setupWithViewPager(viewPager);
    findView_Store();
    findViews_Member();
}