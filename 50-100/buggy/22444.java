@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_timeline);
    pagerAdapter = new com.codepath.apps.restclienttemplate.TweetsPagerAdapter(getSupportFragmentManager(), this);
    android.support.v4.view.ViewPager vpPager = ((android.support.v4.view.ViewPager) (findViewById(R.id.viewpager)));
    vpPager.setAdapter(new com.codepath.apps.restclienttemplate.TweetsPagerAdapter(getSupportFragmentManager(), this));
    android.support.design.widget.TabLayout tabLayout = ((android.support.design.widget.TabLayout) (findViewById(R.id.sliding_tabs)));
    tabLayout.setupWithViewPager(vpPager);
}