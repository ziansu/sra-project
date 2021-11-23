@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    setContentView(R.layout.activity_screen_slide);
    viewPager = ((android.support.v4.view.ViewPager) (findViewById(R.id.pager)));
    pagerAdapter = new com.crystalgems.gemhunt.activity.MainActivity.ScreenSlidePagerAdapter(getSupportFragmentManager());
    viewPager.setAdapter(pagerAdapter);
    viewPager.setCurrentItem(1);
}