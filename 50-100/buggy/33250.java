@java.lang.Override
public void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String key) {
    java.lang.String Tag = "SHared Pref changed";
    java.lang.String value = sharedPreferences.getString(getString(R.string.list_preference_key), "");
    android.util.Log.d(Tag, value);
    if (value.equals(getString(R.string.favourited))) {
        new com.example.samuel.umovies.MovieActivity.FavouriteAsyncTask().execute();
    }else {
        progressBar.setVisibility(View.VISIBLE);
        recyclerView.setVisibility(View.GONE);
        getSupportLoaderManager().restartLoader(com.example.samuel.umovies.MovieActivity.MOVIE_LOADER_ID, null, this);
    }
}