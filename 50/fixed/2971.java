@java.lang.Override
protected void onResume() {
    android.content.SharedPreferences shared = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    shared.registerOnSharedPreferenceChangeListener(this);
    if ((mPrefTimeFenceMinutes) < 999L) {
        registerFence("timeFenceKey");
    }
    super.onResume();
}