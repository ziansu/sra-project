@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_drawer);
    butterknife.ButterKnife.bind(this);
    loadHomeRecipes();
    setSupportActionBar(mToolbar);
    setRecyclerView();
    setDrawerToggle();
    setTvLogoutRipple();
    hasStoragePermission();
    initLetsCookReceiver();
    initProgressDialog();
    mToolbar.setNavigationIcon(android.R.drawable.star_big_on);
    mDrawerFragments = getDrawerFragments();
    mFragmentTags = getResources().getStringArray(R.array.nav_drawer_fragment_tags);
}