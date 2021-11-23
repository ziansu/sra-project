private java.io.File getDownloadPath() {
    java.io.File downloadFile = context.getExternalFilesDir("download");
    if ((null == downloadFile) || (!(downloadFile.exists()))) {
        java.io.File path = context.getFilesDir();
        downloadFile = new java.io.File((path + "download"));
        if (!(downloadFile.exists())) {
            downloadFile.mkdir();
        }
    }
    return downloadFile;
}