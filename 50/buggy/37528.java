public boolean fileExistsInDirectory(java.lang.String fileName) {
    return !((findInDirectory(fileName)) == (-1));
}