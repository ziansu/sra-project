private static long getFreeDiscSpace(java.io.File file) {
    try {
        android.os.StatFs stat = new android.os.StatFs(file.getParentFile().getPath());
        long blocks = stat.getAvailableBlocks();
        long blocksize = stat.getBlockSize();
        return blocks * blocksize;
    } catch (java.lang.IllegalArgumentException e) {
        android.util.Log.e(AnkiDroidApp.TAG, ("Free space could not be retrieved: " + e));
        return ((com.ichi2.anki.BackupManager.MIN_FREE_SPACE) * 1024) * 1024;
    }
}