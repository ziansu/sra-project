public boolean deleteFile(java.lang.String fileName) {
    fatHandler.stopCaching();
    boolean result = fatHandler.deleteFile(fileName);
    fatHandler.continueCaching();
    return result;
}