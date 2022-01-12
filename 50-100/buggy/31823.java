@java.lang.Override
protected void onResume() {
    super.onResume();
    android.content.SharedPreferences sharedPrefs = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    java.lang.String orderBy = sharedPrefs.getString(getString(R.string.settings_order_by_key), getString(R.string.settings_order_by_default));
    if (!(mPreference.equals(orderBy))) {
        startTask();
    }
}