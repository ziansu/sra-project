@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main_menu);
    mPager = ((android.support.v4.view.ViewPager) (findViewById(R.id.pager)));
    mPagerAdapter = new com.example.myself.stuttersupport.MainMenuActivity.ScreenSlidePagerAdapter(getSupportFragmentManager(), getFragments());
    mPager.setAdapter(mPagerAdapter);
    trackerDbHelper = new com.example.myself.stuttersupport.TrackerDbHelper(this);
}