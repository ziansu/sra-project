private void showMovies(java.util.ArrayList<com.conuirwilliamson.popularmovies.models.Movie> movies) {
    hideView(tvErrorMsg);
    hideView(btnFavToMostPopular);
    hideView(btnFavToTopRated);
    hideView(pbLoadingMovies);
    moviesAdapter.setData(movies);
    if (((firstVisibleItemPosition) >= 0) && ((firstVisibleItemPosition) < (movies.size()))) {
        rvMovies.getLayoutManager().scrollToPosition(firstVisibleItemPosition);
    }
    showView(rvMovies);
}