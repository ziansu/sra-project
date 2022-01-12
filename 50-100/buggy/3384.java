@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    java.util.ArrayList<com.example.android.popularmovies.data.Movie> movies = ((java.util.ArrayList<com.example.android.popularmovies.data.Movie>) (mTheMovieDbAdapter.getMMovies()));
    android.util.Log.d(com.example.android.popularmovies.MainActivity.TAG, ("onSaveInstanceState movies: " + (com.example.android.popularmovies.utilities.JsonUtility.toJson(movies))));
    outState.putParcelableArrayList(com.example.android.popularmovies.MainActivity.LIFECYCLE_CALLBACKS_TEXT_KEY, movies);
}