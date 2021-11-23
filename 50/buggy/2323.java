private void setupSharedPreferences() {
    android.content.SharedPreferences sharedPreferences = android.support.v7.preference.PreferenceManager.getDefaultSharedPreferences(this);
    sharedPreferences.getString(getString(R.string.pref_sort_key), getString(R.string.pref_pop_movies_value));
    sharedPreferences.registerOnSharedPreferenceChangeListener(this);
}