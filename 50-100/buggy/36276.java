public static boolean createPath(java.lang.String path) {
    if (Environment.MEDIA_MOUNTED.equals(android.os.Environment.getExternalStorageState())) {
        java.io.File sdDir = android.os.Environment.getExternalStorageDirectory();
        java.io.File newFolder = new java.io.File(((sdDir.getPath()) + path));
        android.util.Log.i("XGFile", newFolder.getAbsolutePath());
        if (!(newFolder.exists())) {
            return newFolder.mkdirs();
        }
    }
    return false;
}