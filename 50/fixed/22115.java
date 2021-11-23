@java.lang.Override
protected void onStart() {
    super.onStart();
    android.content.SharedPreferences sh = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    com.ecsm.android.movie.ui.ActivityBrows.prefWifi = sh.getBoolean(getString(R.string.pref_key_over_wifi), false);
    if (com.ecsm.android.movie.ui.ActivityBrows.refreshStatus)
        checkConnection();
    
    com.ecsm.android.movie.ui.ActivityBrows.refreshStatus = false;
}