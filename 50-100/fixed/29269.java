public static java.lang.String getRealPathFromURI(android.content.Context context, android.net.Uri uri) {
    android.database.Cursor cursor = null;
    int idx = 0;
    if (uri != null) {
        cursor = context.getContentResolver().query(uri, null, null, null, null);
        cursor.moveToFirst();
        idx = cursor.getColumnIndex(MediaStore.Images.ImageColumns.DATA);
    }
    return cursor.getString(idx);
}