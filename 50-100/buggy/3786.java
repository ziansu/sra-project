@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mAdapter = new edu.uw.fragmentdemo.MainActivity.MoviePagerAdapter(getSupportFragmentManager());
    mPager = ((android.support.v4.view.ViewPager) (findViewById(R.id.viewPager)));
    mPager.setAdapter(mAdapter);
    searchFragment = edu.uw.fragmentdemo.SearchFragment.newInstance();
}