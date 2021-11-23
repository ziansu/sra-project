private void setupPreferences() {
    final android.content.SharedPreferences sharedPref = android.preference.PreferenceManager.getDefaultSharedPreferences(getContext());
    setupTileProvidersPreferences(sharedPref);
}