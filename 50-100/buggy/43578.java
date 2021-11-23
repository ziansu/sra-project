private boolean saveBitmapToPath(android.graphics.Bitmap bitmap, java.lang.String path) {
    try {
        java.io.FileOutputStream out = new java.io.FileOutputStream(path);
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, out);
        out.close();
    } catch (java.io.FileNotFoundException e) {
        return false;
    } catch (java.io.IOException e) {
        return false;
    }
    return true;
}