public boolean verifyDirectoryStructure() throws java.io.IOException {
    return (dir.exists()) || (dir.mkdirs());
}