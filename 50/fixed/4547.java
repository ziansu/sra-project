private static boolean isDiscoverModeEnabled() {
    android.content.SharedPreferences preferences = android.preference.PreferenceManager.getDefaultSharedPreferences(com.gcw.sapienza.places.PlacesApplication.getPlacesAppContext());
    return preferences.getBoolean("discoverMode", true);
}