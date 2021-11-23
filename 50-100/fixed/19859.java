private void moveUp() {
    java.lang.String[] pathParts = splitPath();
    java.lang.String path = (systemIsWindows()) ? pathParts[0] : ChangeDirectoryCommand.PATTERN_ROOT_UNIX;
    if (systemIsWindows()) {
        moveUpWindowsPath(pathParts);
    }else {
        moveUpUnixPath(pathParts);
    }
}