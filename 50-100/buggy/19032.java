private java.lang.String getImagePath(android.content.Intent data) {
    android.net.Uri selectedImage = data.getData();
    java.lang.String[] filePathColumn = new java.lang.String[]{ MediaStore.Images.Media.DATA };
    android.database.Cursor cursor = getContentResolver().query(selectedImage, filePathColumn, null, null, null);
    if (cursor != null) {
        cursor.moveToFirst();
        int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
        java.lang.String picturePath = cursor.getString(columnIndex);
        cursor.close();
        return picturePath;
    }
    return null;
}