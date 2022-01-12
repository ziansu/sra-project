private void deleteMovieFromFavorites() {
    android.net.Uri movieUri = android.content.ContentUris.withAppendedId(MovieEntry.CONTENT_URI, java.lang.Long.parseLong(movieId));
    int numberOfRowsDeleted = getContentResolver().delete(movieUri, null, null);
    if ((com.example.wassim.popularmovies.MovieDetailsActivity.favoriteMoviesArrayList.remove(movieId)) && (numberOfRowsDeleted > 0)) {
        mBinding.addImageButton.setImageResource(R.drawable.ic_add);
        android.widget.Toast.makeText(this, "Deleted from favorites", Toast.LENGTH_LONG).show();
        com.example.wassim.popularmovies.MovieDetailsActivity.mMovie.setFavoriteMovie(false);
    }
}