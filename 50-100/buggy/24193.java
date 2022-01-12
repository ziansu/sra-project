public void setMovies(final android.database.Cursor cursor) {
    if ((null != cursor) && ((cursor.getCount()) != 0)) {
        final name.meszaros.gabor.popularmovies.models.Movie[] movies = new name.meszaros.gabor.popularmovies.models.Movie[cursor.getCount()];
        int currentMovieIndex = 0;
        while (cursor.moveToNext()) {
            final name.meszaros.gabor.popularmovies.models.Movie movie = getMovieFromCursor(cursor);
            movies[(currentMovieIndex++)] = movie;
        } 
        setMovies(movies);
    }
}