@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    devicePagerAdapter = new com.example.teeshirt.swipeviews.DevicePagerAdapter(getSupportFragmentManager(), getApplicationContext());
    mViewPager = ((android.support.v4.view.ViewPager) (findViewById(R.id.pager)));
    mViewPager.setAdapter(devicePagerAdapter);
    android.widget.TextView textView = ((android.widget.TextView) (findViewById(R.id.tvDeviceDescription)));
    android.graphics.Typeface typeface = android.graphics.Typeface.createFromAsset(getAssets(), "OpenSans-Light.ttf");
    textView.setTypeface(typeface);
}