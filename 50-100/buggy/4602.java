public void updateMovieList() {
    java.lang.String sortOrder = android.preference.PreferenceManager.getDefaultSharedPreferences(getContext()).getString(getString(R.string.pref_key_sort_order), getString(R.string.pref_default_value_sort_order));
    com.tutorial.nano.popularmovies.FetchMoviesTask moviesTask = new com.tutorial.nano.popularmovies.FetchMoviesTask(getActivity());
    moviesTask.execute(sortOrder);
    getLoaderManager().restartLoader(com.tutorial.nano.popularmovies.FragmentMain.MOVIES_LOADER, null, this);
}