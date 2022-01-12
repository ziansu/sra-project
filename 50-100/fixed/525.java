public static void updateGalleryInfo(android.content.Context context, android.net.Uri uri) {
    android.content.ContentValues values = new android.content.ContentValues();
    java.io.File file = com.isseiaoki.simplecropview.util.Utils.getFileFromUri(context, uri);
    if ((file != null) && (file.exists())) {
        values.put(MediaStore.Images.Media.SIZE, file.length());
    }
    android.content.ContentResolver resolver = context.getContentResolver();
    resolver.update(uri, values, null, null);
}