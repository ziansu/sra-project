@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initView();
    initDatas();
    mAdapter = new com.student0.www.adapter.MyFragmentPagerAdapter(fragmentManager, fragmentList);
    viewPager.setAdapter(mAdapter);
    initEvent();
    com.student0.www.skyone.MyCache.setListCache();
    createSkyOneDir();
    com.student0.www.util.UpLoadPhotos.getInstance();
}