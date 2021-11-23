private java.lang.String getPath(android.net.Uri uri) {
    java.lang.String[] data = new java.lang.String[]{ MediaStore.Images.Media.DATA };
    android.content.CursorLoader loader = new android.content.CursorLoader(this, uri, data, null, null, null);
    android.database.Cursor cursor = loader.loadInBackground();
    int column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
    cursor.moveToFirst();
    java.lang.String a = cursor.getString(column_index);
    cursor.close();
    return a;
}