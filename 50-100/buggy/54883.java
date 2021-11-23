public static java.lang.String getFileNameWithoutExtension(java.io.File f) {
    java.lang.String ext = null;
    java.lang.String s = f.getName();
    int i = s.lastIndexOf('.');
    if ((i > 0) && (i < ((s.length()) - 1))) {
        ext = s.substring(0, i);
    }
    return ext;
}