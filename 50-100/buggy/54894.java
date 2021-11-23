@java.lang.Override
protected void onResume() {
    android.util.Log.d("LocalBroadcastManager", "onResume");
    if (sharedPref.getBoolean(Constants.REFRESH, false)) {
        if ((mAdapter) != null) {
            android.util.Log.d("MainActivity", "Refresh");
            FilterReset(false);
        }
        android.content.SharedPreferences.Editor editor = sharedPref.edit();
        editor.putBoolean(Constants.REFRESH, false);
        editor.apply();
    }
    org.greenrobot.eventbus.EventBus.getDefault().register(this);
    super.onResume();
}