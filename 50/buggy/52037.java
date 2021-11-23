@java.lang.Override
protected void onPause() {
    super.onPause();
    android.content.SharedPreferences sharedPreferences = settingsFragment.getPreferenceScreen().getSharedPreferences();
    sharedPreferences.unregisterOnSharedPreferenceChangeListener(this);
}