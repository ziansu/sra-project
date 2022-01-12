public java.lang.String getRealPathFromURI(android.content.Context context, android.net.Uri contentUri) {
    android.database.Cursor cursor = null;
    try {
        java.lang.String[] proj = new java.lang.String[]{ MediaStore.Images.Media.DATA };
        cursor = context.getContentResolver().query(contentUri, proj, null, null, null);
        int column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
        cursor.moveToFirst();
        return cursor.getString(column_index);
    } finally {
        if (cursor != null) {
            cursor.close();
        }
    }
}