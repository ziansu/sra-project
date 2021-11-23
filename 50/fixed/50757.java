public static java.lang.String getMimeType(java.lang.String filePath) {
    int dotPosition = filePath.lastIndexOf('.');
    if (dotPosition == (-1))
        return "*/*";
    
    java.lang.String ext = filePath.substring((dotPosition + 1), filePath.length()).toLowerCase();
    java.lang.String mimeType = com.openthos.filemanager.system.MimeUtils.guessMimeTypeFromExtension(ext);
    if (ext.equals("mtz")) {
        mimeType = "application/miui-mtz";
    }
    return mimeType != null ? mimeType : "*/*";
}