@java.lang.Override
protected void onResume() {
    super.onResume();
    paused = false;
    boolean notificationLaunched = sharedPreferences.getBoolean("NOTIFICATION_LAUNCHED", false);
    if (notificationLaunched) {
        int progress = sharedPreferences.getInt(getString(R.string.preferences_locations_found_key), 0);
        updateProgress(progress, true);
    }else {
        if (!(backgroundServiceRunning)) {
            startGeolocationService();
        }
    }
}