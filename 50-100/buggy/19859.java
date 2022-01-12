private void moveUp() {
    java.lang.String[] pathParts = splitPath();
    java.lang.String path = (systemIsWindows()) ? pathParts[0] : ChangeDirectoryCommand.PATTERN_ROOT_UNIX;
    java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder(path);
    if (systemIsWindows()) {
        moveUpWindowsPath(pathParts);
    }else {
        moveUpUnixPath(pathParts);
    }
}