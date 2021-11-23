public boolean sortByFavorites() {
    android.content.Context context = getActivity();
    android.content.SharedPreferences sp = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    java.lang.String sortKey = context.getString(R.string.pref_sort_key);
    java.lang.String favorites = context.getString(R.string.pref_sort_favorites);
    if ((sp.getString(sortKey, null)) == null) {
        return false;
    }
    return sp.getString(sortKey, favorites).equals(favorites);
}