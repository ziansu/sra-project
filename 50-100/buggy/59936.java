private void loadFavoriteMovies() {
    showLoadProgressBar();
    final android.database.Cursor cursor = getContentResolver().query(MovieEntry.CONTENT_URI, null, null, null, null);
    if ((null != cursor) && ((cursor.getCount()) != 0)) {
        mAdapter.setMovies(cursor);
        showMoviesList();
    }else {
        showErrorDisplay(R.string.error_no_movies);
    }
}