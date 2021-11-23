@java.lang.Override
protected void onCreate(android.os.Bundle ofJoy) {
    android.content.IntentFilter themeChangeIntentFilter = new android.content.IntentFilter(com.elixsr.portforwarder.ui.preferences.SettingsFragment.DARK_MODE_BROADCAST);
    com.elixsr.portforwarder.ui.BaseActivity.ThemeChangeReceiver themeChangeReceiver = new com.elixsr.portforwarder.ui.BaseActivity.ThemeChangeReceiver();
    android.support.v4.content.LocalBroadcastManager.getInstance(this).registerReceiver(themeChangeReceiver, themeChangeIntentFilter);
    if (android.preference.PreferenceManager.getDefaultSharedPreferences(this).getBoolean("pref_dark_theme", false)) {
        setTheme(R.style.DarkTheme_NoActionBar);
    }
    super.onCreate(ofJoy);
}