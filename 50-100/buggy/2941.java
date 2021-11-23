private java.lang.String getPathFromUri(final android.net.Uri mUri) {
    try {
        android.database.Cursor c = getContentResolver().query(mUri, null, null, null, null);
        c.moveToFirst();
        java.lang.String filename = c.getString(c.getColumnIndex(MediaStore.MediaColumns.DATA));
        return filename;
    } catch (java.lang.NullPointerException e) {
        return null;
    }
}