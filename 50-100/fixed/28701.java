private void setupApp() {
    mActionBarToolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar_actionbar)));
    setSupportActionBar(mActionBarToolbar);
    tv.piratemedia.lightcontroler.controller.prefs = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    android.support.v4.view.ViewPager pager = ((android.support.v4.view.ViewPager) (findViewById(R.id.pager)));
    pager.setAdapter(new tv.piratemedia.lightcontroler.controller.ControllerPager(getSupportFragmentManager(), this));
    tabs = ((com.astuetz.PagerSlidingTabStrip) (findViewById(R.id.pager_title_strip)));
    tabs.setViewPager(pager);
}