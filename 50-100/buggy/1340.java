private java.lang.String getProjectName(java.lang.String pathname) {
    if (pathname == null) {
        return "";
    }
    int index = pathname.indexOf(java.io.File.separatorChar, 1);
    if (index == (-1)) {
        return "";
    }
    return pathname.substring(1, index);
}