public static java.lang.String formatPaginationFilePath(java.lang.String rootPath, int index) {
    if (index <= 1) {
        return (rootPath + (java.io.File.separator)) + "index.html";
    }else {
        return (((((rootPath + (java.io.File.separator)) + "page") + (java.io.File.separator)) + index) + (java.io.File.separator)) + "index.html";
    }
}