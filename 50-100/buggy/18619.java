@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    pagerAdapter = new com.ske.minitrello.adapters.CardListPagerAdapter(getSupportFragmentManager(), 3);
    mViewPager = ((android.support.v4.view.ViewPager) (findViewById(R.id.container)));
    mViewPager.setAdapter(pagerAdapter);
}