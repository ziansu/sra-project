@java.lang.Override
public void onPause() {
    super.onPause();
    android.content.SharedPreferences sharedPreferences = settingsFragment.getPreferenceScreen().getSharedPreferences();
    sharedPreferences.unregisterOnSharedPreferenceChangeListener(this);
}