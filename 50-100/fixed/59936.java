private void loadFavoriteMovies() {
    showLoadProgressBar();
    final android.database.Cursor cursor = getContentResolver().query(MovieEntry.CONTENT_URI, null, null, null, null);
    mAdapter.setMovies(cursor);
    if ((null != cursor) && ((cursor.getCount()) != 0)) {
        showMoviesList();
    }else {
        showErrorDisplay(R.string.error_no_movies);
    }
}