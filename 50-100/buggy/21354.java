@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_import_news);
    com.facebook.drawee.backends.pipeline.Fresco.initialize(this);
    mToolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar_importnews)));
    setSupportActionBar(mToolbar);
    mViewPager = ((android.support.v4.view.ViewPager) (findViewById(R.id.viewpager)));
    mViewPager.setAdapter(new com.tongji.wangjimin.tongjinews.adapter.MainViewPagerAdapter(getSupportFragmentManager()));
    mTabLayout = ((android.support.design.widget.TabLayout) (findViewById(R.id.tablayout_importnews)));
    mTabLayout.setupWithViewPager(mViewPager);
}