@java.lang.Override
public void onResponse(retrofit2.Call<com.example.android.popularmoviesstagetwo.model.MoviesListResponse> call, retrofit2.Response<com.example.android.popularmoviesstagetwo.model.MoviesListResponse> response) {
    if ((response != null) && ((response.body()) != null)) {
        java.util.List<com.example.android.popularmoviesstagetwo.model.Movie> movieList = response.body().getResults();
        mMovieAdapter.clear();
        for (com.example.android.popularmoviesstagetwo.model.Movie movie : movieList) {
            mMovieAdapter.add(movie);
        }
    }else {
        android.widget.Toast.makeText(getContext(), "Cannot access movies list", Toast.LENGTH_SHORT).show();
    }
}