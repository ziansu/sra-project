@java.lang.Override
protected void addSyncRefreshMenuItem(android.support.v4.view.Menu menu, int themeFlags) {
    if (actFmPreferenceService.isLoggedIn()) {
        addMenuItem(menu, R.string.actfm_TVA_menu_refresh, com.todoroo.astrid.service.ThemeService.getDrawable(R.drawable.icn_menu_refresh, themeFlags), com.todoroo.astrid.actfm.TagViewFragment.MENU_REFRESH_ID, true);
    }else {
        super.addSyncRefreshMenuItem(menu, themeFlags);
    }
}