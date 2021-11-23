java.lang.String convertPathToUNC(java.lang.String indexDir) {
    if ((uncPathUtilities) == null) {
        return indexDir;
    }
    java.lang.String result = uncPathUtilities.mappedDriveToUNC(indexDir);
    if (result == null) {
        uncPathUtilities.rescanDrives();
        result = uncPathUtilities.mappedDriveToUNC(indexDir);
    }
    if (result == null) {
        return indexDir;
    }
    return result;
}