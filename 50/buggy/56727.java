public static void validateMovieCursor(java.lang.String error, android.database.Cursor valueCursor, android.content.ContentValues expectedValues) {
    junit.framework.Assert.assertTrue(("Cursor should have records" + error), valueCursor.moveToFirst());
    com.franktan.popularmovies.data.DataTestUtilities.validateMovieRecordUnderCursor(error, valueCursor, expectedValues);
    valueCursor.close();
}