private void getMovies() {
    com.michaelsolati.popularmovies.MovieFragment.FetchMoviesTask moviesTask = new com.michaelsolati.popularmovies.MovieFragment.FetchMoviesTask();
    android.content.SharedPreferences sharedPrefs = android.preference.PreferenceManager.getDefaultSharedPreferences(getActivity());
    java.lang.String sort = sharedPrefs.getString(getString(R.string.pref_units_key), getString(R.string.pref_units_descending));
    if (sort == (getString(R.string.pref_units_ascending))) {
        sort = "popularity.asc";
    }
    moviesTask.execute(sort);
}