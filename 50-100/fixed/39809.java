@java.lang.Override
protected void onStart() {
    super.onStart();
    mPrefs = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    boolean isFirstLaunch = mPrefs.getBoolean(pl.kfeed.mypromil.MainActivity.FIRST_USE_SCREEN_SHOWN_PREF, true);
    if (isFirstLaunch) {
        android.view.View view = findViewById(R.id.drawer_layout);
        view.post(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                showWelcomeScreen();
            }
        });
    }
}