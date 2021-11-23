private void updateMovies() {
    preferences = android.preference.PreferenceManager.getDefaultSharedPreferences(getActivity());
    sortedBy = preferences.getString(getString(R.string.pref_sort_key), getString(R.string.pref_sort_popular));
    com.mohamedibrahim.popularmovies.managers.MoviesManager moviesManager = new com.mohamedibrahim.popularmovies.managers.MoviesManager(this, sortedBy);
    moviesManager.execute();
}