@java.lang.Override
protected void onResume() {
    super.onResume();
    sharedPreferences.registerOnSharedPreferenceChangeListener(this);
    displayTimeRemaining();
}