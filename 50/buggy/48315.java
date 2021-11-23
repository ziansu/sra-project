public boolean verifyDirectoryStructure() throws java.io.IOException {
    return ((dir.exists()) & (dir.mkdirs())) & (new java.io.File(dir, name).createNewFile());
}