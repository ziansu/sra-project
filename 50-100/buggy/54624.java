@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (org.fasola.fasolaminutes.PlaybackService.isRunning())
        org.fasola.fasolaminutes.PlaybackService.getInstance().setMainTaskRunning(true);
    
    setContentView(R.layout.activity_main);
    mViewPager.setOffscreenPageLimit(mPagerAdapter.getCount());
    setOnPageChangeListener(mPageChangeListener);
    handleIntent(getIntent());
}