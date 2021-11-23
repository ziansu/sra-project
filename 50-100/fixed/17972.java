public static android.support.v4.provider.DocumentFile createDirIfNotExist(android.support.v4.provider.DocumentFile root, java.lang.String... subDirs) {
    android.support.v4.provider.DocumentFile parent = root;
    for (int i = 0; i < (subDirs.length); i++) {
        java.lang.String subDirName = subDirs[i];
        android.support.v4.provider.DocumentFile subDir = parent.findFile(subDirName);
        if (subDir == null) {
            subDir = parent.createDirectory(subDirName);
        }
        parent = subDir;
    }
    return parent;
}