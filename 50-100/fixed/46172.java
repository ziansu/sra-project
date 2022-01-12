@com.google.common.annotations.VisibleForTesting
static java.io.File concatFolders(final java.io.File projectBaseDir, final java.lang.String... folderNames) {
    java.lang.StringBuilder b = new java.lang.StringBuilder();
    for (java.lang.String folder : folderNames) {
        b.append(folder);
        b.append(java.io.File.separator);
    }
    return new java.io.File(projectBaseDir, b.toString());
}