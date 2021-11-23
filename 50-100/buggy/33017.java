public void addFavorite(android.content.Context c) {
    android.content.ContentValues movieValues = new android.content.ContentValues();
    movieValues.put(MovieContract.MovieEntry.COLUMN_ID, id);
    movieValues.put(MovieContract.MovieEntry.COLUMN_TITLE, title);
    movieValues.put(MovieContract.MovieEntry.COLUMN_RELEASE, releaseDate);
    movieValues.put(MovieContract.MovieEntry.COLUMN_RATING, voteAverage);
    movieValues.put(MovieContract.MovieEntry.COLUMN_OVERVIEW, overview);
    movieValues.put(MovieContract.MovieEntry.COLUMN_POSTER_PATH, getPosterPath(com.example.shevchenko.movies.model.Movie.DEFAULT_SIZE));
    c.getContentResolver().insert(MovieContract.MovieEntry.CONTENT_URI, movieValues);
}