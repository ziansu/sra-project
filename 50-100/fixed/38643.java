public void persist() throws java.io.IOException {
    final java.nio.file.Path directory = java.nio.file.Paths.get(fileName).getParent();
    if (directory != null) {
        java.nio.file.Files.createDirectories(directory);
    }
    java.io.FileOutputStream out = null;
    try {
        out = new java.io.FileOutputStream(fileName);
        details.store(out, null);
    } finally {
        com.puppycrawl.tools.checkstyle.PropertyCacheFile.flushAndCloseOutStream(out);
    }
}