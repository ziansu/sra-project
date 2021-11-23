public static long getDirSize(java.lang.String path) {
    android.os.StatFs stat = new android.os.StatFs(path);
    if ((Build.VERSION.SDK_INT) >= (AndroidVersion.JELLY_BEAN_MR2))
        return com.yolanda.nohttp.tools.IOUtils.getStatFsSize(stat, "getBlockSizeLong", "getAvailableBlocksLong");
    else
        return com.yolanda.nohttp.tools.IOUtils.getStatFsSize(stat, "getBlockSize", "getAvailableBlocks");
    
}