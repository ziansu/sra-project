public boolean hasBeenUpdated() throws java.io.IOException {
    long modified = file.lastModified();
    if (modified == 0L) {
        throw new java.io.IOException("File deleted");
    }
    long fileSizeNow = file.length();
    return ((timeStamp) != modified) || ((fileSize) != fileSizeNow);
}