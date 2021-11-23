private java.lang.String getFiles(java.lang.String filename, java.lang.String directory) {
    java.lang.String dir = (directory != null) ? directory : ".";
    java.util.List<java.lang.String> res = findFiles(filename, dir);
    return atos(res);
}