public boolean writeFile(java.io.File file) {
    fatHandler.stopCaching();
    boolean result = fatHandler.writeNewFile(file);
    fatHandler.continueCaching();
    return result;
}