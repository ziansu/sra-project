@java.lang.Override
public void onResponse(retrofit2.Call<com.mcodefactory.popularmovies.api_result_models.MovieResult> call, retrofit2.Response<com.mcodefactory.popularmovies.api_result_models.MovieResult> response) {
    java.util.List<com.mcodefactory.popularmovies.data.Movie> moviesPerPage = response.body().getResults();
    parseAndAddToCollection(moviesPerPage);
    android.util.Log.d(com.mcodefactory.popularmovies.MainActivity.TAG, ("Number of movies received: " + (movies.size())));
    if ((movies.size()) > previousMovieCount) {
        showMovieDataView();
        mAdapter.setData(movies);
    }
}