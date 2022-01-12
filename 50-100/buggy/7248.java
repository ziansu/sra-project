public static boolean isRosterPath(java.lang.String path) {
    path = path.trim().toLowerCase();
    if (((path.endsWith(DataConstants.ROSTER_FILE_EXTENSION)) || (path.endsWith(DataConstants.ROSTER_COMPRESSED_FILE_EXTENSION))) || (path.endsWith(DataConstants.ROSTER_COMPRESSED_FILE_EXTENSION_OLD))) {
        return true;
    }
    return false;
}