private void settingView() {
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (this.findViewById(R.id.main_toolbar)));
    setSupportActionBar(toolbar);
    gppmds.wikilegis.view.TabsAdapter tabsAdapter = new gppmds.wikilegis.view.TabsAdapter(getSupportFragmentManager());
    android.support.v4.view.ViewPager viewPager = ((android.support.v4.view.ViewPager) (findViewById(R.id.container)));
    viewPager.setAdapter(tabsAdapter);
    tabs = ((android.support.design.widget.TabLayout) (this.findViewById(R.id.tabs)));
    tabs.setupWithViewPager(viewPager);
}