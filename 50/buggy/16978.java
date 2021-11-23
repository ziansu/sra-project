protected android.content.SharedPreferences getSharedPreferences(android.content.Context context) {
    if ((preferences) == null) {
        context.getSharedPreferences(getSharePreferenceName(), Context.MODE_PRIVATE);
    }
    return preferences;
}