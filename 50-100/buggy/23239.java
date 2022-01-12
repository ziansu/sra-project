public void createDirectory(java.lang.String dirname) throws java.io.IOException {
    int createdCount = 0;
    for (java.lang.String path : autosaveworld.utils.FileUtils.splitPath(dirname)) {
        if (!(exists(path))) {
            createDirectory0(path);
        }
        enterDirectory0(dirname);
        createdCount++;
    }
    while ((createdCount--) > 0) {
        leaveDirectory();
    } 
}