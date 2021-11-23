public static long getDirSize(java.lang.String path) {
    android.os.StatFs stat = new android.os.StatFs(path);
    java.lang.Class<?> statFsClass = stat.getClass();
    if ((Build.VERSION.SDK_INT) >= (AndroidVersion.JELLY_BEAN_MR2))
        return com.yolanda.nohttp.tools.IOUtils.getStatFsSize(stat, statFsClass, "getBlockSizeLong", "getAvailableBlocksLong");
    else
        return com.yolanda.nohttp.tools.IOUtils.getStatFsSize(stat, statFsClass, "getBlockSize", "getAvailableBlocks");
    
}