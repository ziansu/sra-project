@java.lang.Override
protected void onResume() {
    super.onResume();
    android.content.SharedPreferences prefs = getSharedPreferences(com.beesham.beerac.ui.HomeActivity.PREF_FILE, Context.MODE_PRIVATE);
    if (prefs.contains(getString(R.string.preferred_beer_key))) {
        mBeerId = prefs.getString(getString(R.string.preferred_beer_key), getString(R.string.default_preferred_beer));
    }
    getSupportLoaderManager().restartLoader(LOADER_ID, null, this);
    mTracker.setScreenName(getString(R.string.home_screen_title));
    mTracker.send(new com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder().build());
}