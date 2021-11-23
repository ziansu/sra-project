@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    setTheme(R.style.AppTheme);
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_coffees);
    butterknife.ButterKnife.bind(this);
    setUpToolbar();
    mNetworkChangeBroadcastReceiver = new com.alexzh.imbarista.utils.NetworkChangeBroadcastReceiver(this);
    getActivityComponent().inject(this);
    mTabAdapter = new com.alexzh.imbarista.coffees.adapter.TabViewPagerAdapter(getSupportFragmentManager());
    mViewPager.setAdapter(mTabAdapter);
    mTabs.setupWithViewPager(mViewPager);
}