protected android.content.SharedPreferences getSharedPreferences(android.content.Context context) {
    if ((preferences) == null) {
        preferences = context.getSharedPreferences(getSharePreferenceName(), Context.MODE_PRIVATE);
    }
    return preferences;
}