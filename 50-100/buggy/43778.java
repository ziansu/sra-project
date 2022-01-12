public int getOrientation(android.content.Context context, android.net.Uri photoUri) {
    int rotateIntValue = 0;
    android.database.Cursor cursor = context.getContentResolver().query(photoUri, new java.lang.String[]{ MediaStore.Images.ImageColumns.ORIENTATION }, null, null, null);
    if ((cursor.getCount()) != 1) {
        rotateIntValue = -1;
    }else {
        cursor.moveToFirst();
        rotateIntValue = cursor.getInt(0);
    }
    cursor.close();
    return rotateIntValue;
}