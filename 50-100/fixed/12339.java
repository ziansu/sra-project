private java.lang.String saveBookmarkImageBitmap(android.graphics.Bitmap bitmap, java.lang.String postId, java.lang.String filename) {
    try {
        java.io.File file = createBookmarkImageFile(postId, filename);
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
        bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        return file.getAbsolutePath();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return null;
}