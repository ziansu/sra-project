@java.lang.Override
public android.database.Cursor query(@android.support.annotation.NonNull
android.net.Uri uri, java.lang.String[] projection, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String sortOrder) {
    final android.database.sqlite.SQLiteDatabase db = mSavedFavouriteDbHelper.getReadableDatabase();
    int match = com.example.android.myapplication.FavouriteProvider.sUriMatcher.match(uri);
    android.database.Cursor returnCursor;
    switch (match) {
        case com.example.android.myapplication.FavouriteProvider.FAVOURITES :
            returnCursor = db.query(SavedFavouriteContract.FavEntry.TABLE_NAME, projection, selection, selectionArgs, null, null, sortOrder);
            db.close();
            break;
        default :
            throw new java.lang.UnsupportedOperationException("Not yet implemented");
    }
    return returnCursor;
}