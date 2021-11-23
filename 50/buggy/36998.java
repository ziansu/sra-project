private void updateMoviePosters() {
    com.blogspot.nagellaranjith.android.popularmoviesstage1.MainActivityFragment.FetchMovieTask fetchMoviePosters = new com.blogspot.nagellaranjith.android.popularmoviesstage1.MainActivityFragment.FetchMovieTask();
    android.content.SharedPreferences sharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(getActivity());
    java.lang.String sort_order = sharedPreferences.getString(getString(R.string.pref_sort_order), "popularity.desc");
    fetchMoviePosters.execute(sort_order);
}