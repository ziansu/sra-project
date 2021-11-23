private boolean isDiscoverModeEnabled() {
    android.content.SharedPreferences preferences = android.preference.PreferenceManager.getDefaultSharedPreferences(com.gcw.sapienza.places.PlacesApplication.getPlacesAppContext());
    boolean discoverMode = preferences.getBoolean("discoverMode", true);
    return discoverMode;
}