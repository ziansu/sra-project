private boolean setupViewPager() {
    viewPager = findViewById(R.id.view_pager);
    if ((viewPager) != null) {
        viewPager.setAdapter(adapter);
        android.support.design.widget.TabLayout tabLayout = findViewById(R.id.tab_layout);
        if (tabLayout != null) {
            tabLayout.setupWithViewPager(viewPager);
        }
        return true;
    }
    return false;
}