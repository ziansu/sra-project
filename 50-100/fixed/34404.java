@java.lang.Override
public android.database.Cursor query(android.net.Uri uri, java.lang.String[] projection, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String sortOrder) {
    switch (com.examples.antonio.popularmovies.data.MovieProvider.matcher.match(uri)) {
        case com.examples.antonio.popularmovies.data.MovieProvider.MOVIE :
            {
                return com.examples.antonio.popularmovies.data.MovieProvider.MovieWithCommentsAndTrailersQueryBuilder.query(mDbHelper.getReadableDatabase(), projection, selection, selectionArgs, null, null, sortOrder);
            }
        case com.examples.antonio.popularmovies.data.MovieProvider.MOVIE_WITH_CODE :
            {
                return getMovieWithCode(uri, projection, sortOrder);
            }
        default :
            throw new java.lang.UnsupportedOperationException(("Unknown uri: " + uri));
    }
}