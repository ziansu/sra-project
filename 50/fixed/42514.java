public static boolean isIndexPath(java.lang.String path) {
    path = path.trim().toLowerCase();
    return (path.endsWith(DataConstants.INDEX_COMPRESSED_FILE_EXTENSION)) || (path.endsWith(DataConstants.DEFAULT_INDEX_FILE_NAME));
}