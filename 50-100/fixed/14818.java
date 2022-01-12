private boolean updateAdapter(me.piebridge.brevent.ui.AppsPagerAdapter adapter) {
    android.content.SharedPreferences sp = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    boolean showAllApps = sp.getBoolean(SettingsFragment.SHOW_ALL_APPS, SettingsFragment.DEFAULT_SHOW_ALL_APPS);
    boolean showFramework = sp.getBoolean(SettingsFragment.SHOW_FRAMEWORK_APPS, SettingsFragment.DEFAULT_SHOW_FRAMEWORK_APPS);
    return (adapter.setShowAllApps(showAllApps)) | (adapter.setShowFramework(showFramework));
}