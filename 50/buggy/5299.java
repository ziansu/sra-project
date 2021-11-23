private void setupPreferences() {
    final android.content.Context context = getContext();
    final android.content.SharedPreferences sharedPref = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    setupTileProvidersPreferences(sharedPref);
}