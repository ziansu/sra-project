@java.lang.Override
public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    android.view.MenuItem toggle_service = menu.findItem(R.id.menu_toggle_service);
    boolean collectingData = android.preference.PreferenceManager.getDefaultSharedPreferences(this).getBoolean(Preferences.PREFERENCE_COLLECTING_DATA, true);
    toggle_service.setTitle((collectingData ? R.string.menu_disable_service : R.string.menu_enable_service));
    return true;
}