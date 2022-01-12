private java.lang.String getPathFromUri(final android.net.Uri mUri) {
    android.database.Cursor c = getContentResolver().query(mUri, null, null, null, null);
    if ((c != null) && (c.moveToFirst())) {
        java.lang.String filename = c.getString(c.getColumnIndex(MediaStore.MediaColumns.DATA));
        return filename;
    }else {
        return null;
    }
}