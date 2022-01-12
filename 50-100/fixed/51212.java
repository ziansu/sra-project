private android.net.Uri getCurrentContentUri() {
    android.net.Uri retVal = null;
    if ((mCursor) != null) {
        int fieldIndex = mCursor.getColumnIndex(MediaStore.Images.Media._ID);
        android.util.Log.d("getCurrentContentUri", java.lang.String.valueOf(fieldIndex));
        java.lang.Long id = mCursor.getLong(fieldIndex);
        retVal = android.content.ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, id);
        android.util.Log.d("ANDROID", ("URI : " + (retVal.toString())));
    }
    return retVal;
}