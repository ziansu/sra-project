public static void deleteDirectoryFromBottomUp(java.io.File dir) throws java.io.IOException {
    if (dir.isFile()) {
        throw new java.io.IOException("Expected as dir as an argument, got a file");
    }
    java.io.File[] files = dir.listFiles();
    if (files == null) {
        return ;
    }
    for (java.io.File child : files) {
        if (child.isDirectory()) {
            org.bladerunnerjs.utility.FileUtils.deleteDirectoryFromBottomUp(child);
        }else {
            child.delete();
        }
    }
    dir.delete();
}