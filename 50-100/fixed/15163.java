public static java.io.File getCacheDir(java.lang.String imgName) {
    java.io.File rootDir = new java.io.File(android.os.Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), cn.lemon.multi.util.Util.IMG_DIR);
    if (!(rootDir.exists())) {
        rootDir.mkdir();
    }
    return new java.io.File(rootDir, imgName);
}