static java.io.File concatFolders(java.io.File projectBaseDir, java.lang.String... folderNames) {
    java.lang.StringBuilder b = new java.lang.StringBuilder();
    for (java.lang.String folder : folderNames) {
        b.append(folder);
        b.append(java.io.File.separator);
    }
    return new java.io.File(projectBaseDir, b.toString());
}