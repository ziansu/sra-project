private java.lang.String getLastUpdatedDate(android.content.Context context) {
    android.content.SharedPreferences sharedPref = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    return sharedPref.getString(Constants.KEY_LAST_UPDATED_DATE, "N/A");
}