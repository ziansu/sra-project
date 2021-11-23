private static boolean isMissing(java.lang.String fileName, java.util.Set<java.io.File> filesInResourceBundle) {
    boolean missing = false;
    for (java.io.File file : filesInResourceBundle) {
        final java.lang.String currentFileName = file.getPath();
        missing = !(currentFileName.equals(fileName));
        if (!missing) {
            break;
        }
    }
    return missing;
}