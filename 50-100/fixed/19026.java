@java.lang.Override
protected void onResume() {
    super.onResume();
    android.content.SharedPreferences prefs = getSharedPreferences(com.beesham.beerac.ui.HomeActivity.PREF_FILE, Context.MODE_PRIVATE);
    if (prefs.contains(getString(R.string.preferred_beer_key))) {
        if ((mBeerId) != null) {
            mBeerId = prefs.getString(getString(R.string.preferred_beer_key), null);
            getSupportLoaderManager().restartLoader(LOADER_ID, null, this);
        }
    }
    mTracker.setScreenName(getString(R.string.home_screen_title));
    mTracker.send(new com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder().build());
}