@java.lang.Override
public int delete(android.net.Uri uri, java.lang.String selection, java.lang.String[] selectionArgs) {
    mDb = mDBHelper.getWritableDatabase();
    java.lang.String table;
    switch (com.googlemaps.template.myapplication.database.MyContentProvider.uriMatcher.match(uri)) {
        case com.googlemaps.template.myapplication.database.MyContentProvider.URI_DIRECTIONS :
            table = DBHelper.TABLE_DIRECTIONS;
            break;
        case com.googlemaps.template.myapplication.database.MyContentProvider.URI_PLACES :
            table = DBHelper.TABLE_POINTS;
            break;
        default :
            throw new java.lang.UnsupportedOperationException(("Unknown uri " + (uri.toString())));
    }
    int count = mDb.delete(table, selection, selectionArgs);
    return count;
}