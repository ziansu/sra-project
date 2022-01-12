@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    devicePagerAdapter = new com.example.teeshirt.swipeviews.DevicePagerAdapter(getSupportFragmentManager(), getApplicationContext());
    mViewPager = ((android.support.v4.view.ViewPager) (findViewById(R.id.pager)));
    mViewPager.setAdapter(devicePagerAdapter);
}