@java.lang.Override
protected void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
    if (intent.hasExtra(info.schnatterer.nusic.android.activities.MainActivity.EXTRA_ACTIVE_TAB)) {
        info.schnatterer.nusic.android.activities.MainActivity.currentTab = ((info.schnatterer.nusic.android.activities.MainActivity.TabDefinition) (getIntent().getExtras().get(info.schnatterer.nusic.android.activities.MainActivity.EXTRA_ACTIVE_TAB)));
        android.support.v4.view.ViewPager pager = ((android.support.v4.view.ViewPager) (findViewById(R.id.mainPager)));
        pager.setCurrentItem(info.schnatterer.nusic.android.activities.MainActivity.currentTab.position);
    }
}