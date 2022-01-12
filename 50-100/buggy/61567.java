@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON, WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    setContentView(R.layout.activity_main);
    mSectionsPagerAdapter = new com.junseok.snowtest.MainActivity.SectionsPagerAdapter(getSupportFragmentManager());
    mViewPager = ((android.support.v4.view.ViewPager) (findViewById(R.id.container)));
    mViewPager.setAdapter(mSectionsPagerAdapter);
    mViewPager.setCurrentItem(1);
}