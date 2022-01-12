public java.lang.String getFileExtension(java.lang.String filepath, java.lang.String defaultExtension) {
    java.lang.String extension = "";
    if (filepath != null) {
        int i = filepath.lastIndexOf('.');
        if (i > 0) {
            extension = filepath.substring((i + 1));
        }else {
            extension = "";
        }
    }
    if ((android.text.TextUtils.isEmpty(extension)) && (!(android.text.TextUtils.isEmpty(defaultExtension)))) {
        extension = defaultExtension;
    }
    return extension;
}