private void updatePosters() {
    com.example.akgul.movies_application.MainActivityFragment.FetchMovieTask fetchMovieTask = new com.example.akgul.movies_application.MainActivityFragment.FetchMovieTask();
    android.content.SharedPreferences sharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(getActivity());
    java.lang.String sortType = sharedPreferences.getString("order", "popularity.desc");
    fetchMovieTask.execute(sortType);
}