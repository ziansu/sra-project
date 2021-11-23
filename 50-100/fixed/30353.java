static java.lang.String addDirectorySlash(java.lang.String path, char separator) {
    if ((path != "") && ((path.trim().charAt(((path.length()) - 1))) != separator)) {
        path = (path.trim()) + "/";
    }
    return path;
}