public void setMovies(final android.database.Cursor cursor) {
    name.meszaros.gabor.popularmovies.models.Movie[] movies = null;
    if (null != cursor) {
        movies = new name.meszaros.gabor.popularmovies.models.Movie[cursor.getCount()];
        int currentMovieIndex = 0;
        while (cursor.moveToNext()) {
            final name.meszaros.gabor.popularmovies.models.Movie movie = getMovieFromCursor(cursor);
            movies[(currentMovieIndex++)] = movie;
        } 
    }
    setMovies(movies);
}