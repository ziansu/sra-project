@java.lang.Override
protected void onPause() {
    super.onPause();
    android.content.SharedPreferences pref = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
}