@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<android.database.Cursor> loader, android.database.Cursor movies) {
    progressBar.setVisibility(View.INVISIBLE);
    if ((movies.getCount()) == 0) {
        showErrorMessage();
    }else {
        movieAdapter.setMovies(movies);
        showFavoriteMoviesView();
    }
    if ((movies.getCount()) != 0)
        showFavoriteMoviesView();
    
}