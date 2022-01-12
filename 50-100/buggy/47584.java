@android.support.annotation.Nullable
@java.lang.Override
public android.database.Cursor query(@android.support.annotation.NonNull
android.net.Uri uri, java.lang.String[] projection, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String sortOrder) {
    android.database.Cursor cursor;
    switch (com.conz13.d.strongpasswordcreator.data.PasswordProvider.mUriMatcher.match(uri)) {
        case com.conz13.d.strongpasswordcreator.data.PasswordProvider.DATA :
            {
                cursor = getDataCursor(projection, sortOrder);
                break;
            }
        default :
            throw new java.lang.UnsupportedOperationException(("Uri unknown: " + uri));
    }
    cursor.setNotificationUri(getContext().getContentResolver(), uri);
    return cursor;
}