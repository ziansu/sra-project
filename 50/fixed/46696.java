private boolean isFirstStart() {
    return android.preference.PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getBoolean(io.gloop.drawed.SplashActivity.SHARED_PREFERENCES_FIRST_START, true);
}