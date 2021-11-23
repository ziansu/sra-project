public void testQueryTrailer() {
    setupProvider();
    long movieId = insertMovie();
    android.content.ContentValues trailerValue = com.keemsa.popularmovies.data.TestUtilities.createTrailerValues();
    mContext.getContentResolver().insert(MovieProvider.Trailer.ALL, trailerValue);
    android.database.Cursor c = mContext.getContentResolver().query(MovieProvider.Trailer.ALL, null, null, null, null);
    assertTrue(((c.getCount()) != 0));
    com.keemsa.popularmovies.data.TestUtilities.validateCursor("", c, trailerValue);
}