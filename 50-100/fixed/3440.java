public static java.io.File getImageCacheDirectory(android.content.Context context) {
    java.io.File directory = new java.io.File(((com.example.getimage.utils.Utils.getStoragePath(context)) + "images/"));
    if (!(directory.exists())) {
        boolean b = directory.mkdirs();
        if (!b) {
            return null;
        }
    }
    return directory;
}