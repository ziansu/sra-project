public void setUserPreferences() {
    android.content.Context context = getActivity();
    android.content.SharedPreferences preferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    userLat = java.lang.Double.parseDouble(preferences.getString("edit_text_pref_lat", ""));
    userLong = java.lang.Double.parseDouble(preferences.getString("edit_text_pref_long", ""));
    showObserved = preferences.getBoolean("pref_show_observed", true);
    showBelowHoriz = preferences.getBoolean("pref_show_below_horiz", true);
}