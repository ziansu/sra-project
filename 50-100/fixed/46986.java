private void setupViewPager() {
    android.util.Log.e(com.pratilipi.mobile.android.homescreen.home.HomeFragment.LOG_TAG, "HomeFragment. setupViewPage function start");
    mTabsAdapter.addFragment(new com.pratilipi.mobile.android.homescreen.home.trending.TrendingFragment(), getResources().getString(R.string.tab_name_trending));
    mTabsAdapter.addFragment(new com.pratilipi.mobile.android.homescreen.home.categories.CategoriesFragment(), getResources().getString(R.string.tab_name_categories));
    mViewPager.setAdapter(mTabsAdapter);
    android.util.Log.e(com.pratilipi.mobile.android.homescreen.home.HomeFragment.LOG_TAG, "HomeFragment. setupViewPage function End");
}