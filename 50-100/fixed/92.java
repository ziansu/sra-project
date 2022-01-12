@java.lang.Override
public void onResponse(retrofit2.Call<com.mcodefactory.popularmovies.api_result_models.MovieResult> call, retrofit2.Response<com.mcodefactory.popularmovies.api_result_models.MovieResult> response) {
    java.util.List<com.mcodefactory.popularmovies.data.Movie> moviesPerPage = response.body().getResults();
    parseAndAddToCollection(moviesPerPage);
    if ((movies.size()) > previousMovieCount) {
        showMovieDataView();
        mAdapter.setData(movies);
    }
}