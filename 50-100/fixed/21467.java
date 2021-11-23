@java.lang.SafeVarargs
private final void setupViewPager(android.view.View view, android.support.design.widget.TabLayout tabs, android.util.Pair<android.support.v4.app.Fragment, java.lang.String>... fragments) {
    viewPagerAdapter = new com.pierfrancescosoffritti.slidingdrawer_sample.adapters.ViewPagerAdapter(getChildFragmentManager(), fragments);
    android.support.v4.view.ViewPager viewPager = ((android.support.v4.view.ViewPager) (view.findViewById(R.id.view_pager)));
    viewPager.setAdapter(viewPagerAdapter);
    tabs.setupWithViewPager(viewPager);
}