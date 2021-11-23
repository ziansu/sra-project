private boolean setupViewPager() {
    viewPager = findViewById(R.id.view_pager);
    if ((viewPager) != null) {
        ru.yamblz.weather.ui.cities.CitiesActivity.CitiesPagerAdapter adapter = new ru.yamblz.weather.ui.cities.CitiesActivity.CitiesPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        android.support.design.widget.TabLayout tabLayout = findViewById(R.id.tab_layout);
        if (tabLayout != null) {
            tabLayout.setupWithViewPager(viewPager);
        }
        return true;
    }
    return false;
}