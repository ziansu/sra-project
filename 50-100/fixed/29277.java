public static void setFilePaths(java.lang.String basePath) {
    if (basePath.equals("none")) {
        basePath = android.os.Environment.getExternalStorageDirectory().getPath();
    }
    com.rfo.basic.Basic.basePath = basePath;
    com.rfo.basic.Basic.filePath = new java.io.File(basePath, com.rfo.basic.Basic.AppPath).getPath();
}