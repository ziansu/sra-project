public static final boolean safeDeleteFile(java.io.File file) {
    if (file == null) {
        return true;
    }
    if (file.exists()) {
        android.util.Log.i(com.tencent.tinker.loader.shareutil.SharePatchFileUtil.TAG, ("safeDeleteFile, try to delete path: " + (file.getPath())));
        boolean deleted = file.delete();
        if (!deleted) {
            android.util.Log.e(com.tencent.tinker.loader.shareutil.SharePatchFileUtil.TAG, ("Failed to delete file, try to delete when exit. path: " + (file.getPath())));
            file.deleteOnExit();
        }
        return deleted;
    }
    return true;
}