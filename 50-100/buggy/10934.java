@java.lang.Override
public void onResponse(retrofit2.Call<com.movielist.aishwarytandon.movielist.MovieResponse> call, retrofit2.Response<com.movielist.aishwarytandon.movielist.MovieResponse> response) {
    java.util.List<com.movielist.aishwarytandon.movielist.Movie> movies = response.body().getResults();
    recyclerView.setAdapter(new com.movielist.aishwarytandon.movielist.MovieAdapter(movies, R.layout.list_item_movie, getApplicationContext()));
    android.util.Log.d(com.movielist.aishwarytandon.movielist.MainActivity.TAG, ("Number of movies received: " + (movies.size())));
}