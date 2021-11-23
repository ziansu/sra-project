public static void setFilePaths(java.lang.String basePath) {
    if (basePath.equals("none"))
        basePath = android.os.Environment.getExternalStorageDirectory().getPath();
    
    com.rfo.basic.Basic.basePath = basePath;
    com.rfo.basic.Basic.filePath = (basePath + (java.io.File.separatorChar)) + (com.rfo.basic.Basic.AppPath);
}