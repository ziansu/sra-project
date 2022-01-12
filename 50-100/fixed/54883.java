public static java.lang.String getFileNameWithoutExtension(java.io.File f) {
    java.lang.String fileName = f.getName();
    int i = fileName.lastIndexOf('.');
    if ((i > 0) && (i < ((fileName.length()) - 1))) {
        fileName = fileName.substring(0, i);
    }
    return fileName;
}