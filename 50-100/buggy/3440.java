public static java.io.File getImageCacheDirectory(android.content.Context context) {
    java.io.File directory = new java.io.File(((com.example.getimage.utils.Utils.getStoragePath(context)) + "images/"));
    if (!(directory.exists())) {
        directory.mkdirs();
    }
    return directory;
}