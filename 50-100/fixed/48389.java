private void doMySearch(java.lang.String movie_title) {
    android.content.SharedPreferences sharedPref = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    java.lang.String sort_order_with_title = (getResources().getStringArray(R.array.sort_values)[8]) + movie_title;
    sharedPref.edit().putString(getString(R.string.pref_sort_key), sort_order_with_title).apply();
    sharedPref.edit().putString(getString(R.string.pref_search_title), movie_title).apply();
    uploadMovies();
}