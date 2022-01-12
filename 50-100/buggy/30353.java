static void addDirectorySlash(java.lang.String path, char separator) {
    if ((path != "") && ((path.trim().charAt(((path.length()) - 1))) != separator)) {
        path = (path.trim()) + "/";
    }
}