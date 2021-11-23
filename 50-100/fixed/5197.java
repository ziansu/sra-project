private java.lang.String[] getFavorites() {
    android.content.SharedPreferences pref = android.preference.PreferenceManager.getDefaultSharedPreferences(mCtx);
    java.util.Set<java.lang.String> favorites = pref.getStringSet(mCtx.getResources().getString(R.string.favorites_list), null);
    if (favorites != null) {
        return favorites.toArray(new java.lang.String[favorites.size()]);
    }
    return null;
}