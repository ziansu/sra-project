private void getMovies() {
    com.michaelsolati.popularmovies.MovieFragment.FetchMoviesTask moviesTask = new com.michaelsolati.popularmovies.MovieFragment.FetchMoviesTask();
    android.content.SharedPreferences sharedPrefs = android.preference.PreferenceManager.getDefaultSharedPreferences(getActivity());
    java.lang.String sort = sharedPrefs.getString(getString(R.string.pref_units_key), getString(R.string.pref_units_popularity));
    moviesTask.execute(sort);
}