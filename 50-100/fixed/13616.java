@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    java.util.ArrayList<com.example.android.popularmovies1.data.entities.MovieListItem> movies = moviesAdapter.getMovies();
    com.example.android.popularmovies1.data.entities.PageInfo pageInfo = moviesAdapter.getPageInfo();
    if ((movies != null) && ((movies.size()) > 0)) {
        outState.putParcelableArrayList(com.example.android.popularmovies1.activities.MoviesListActivity.STORAGE_KEY_MOVIES, movies);
        outState.putParcelable(com.example.android.popularmovies1.activities.MoviesListActivity.STORAGE_KEY_PAGEINFO, pageInfo);
    }
    outState.putInt(com.example.android.popularmovies1.activities.MoviesListActivity.STORAGE_KEY_MODE, mode.getValue());
}