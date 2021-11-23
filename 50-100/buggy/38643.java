public void persist() throws java.io.IOException {
    try {
        final java.nio.file.Path directory = java.nio.file.Paths.get(fileName).getParent();
        if (directory != null) {
            java.nio.file.Files.createDirectories(directory);
        }
    } catch (java.nio.file.InvalidPathException | java.nio.file.AccessDeniedException ex) {
        throw new java.lang.IllegalStateException(ex.getMessage(), ex);
    }
    java.io.FileOutputStream out = null;
    try {
        out = new java.io.FileOutputStream(fileName);
        details.store(out, null);
    } finally {
        com.puppycrawl.tools.checkstyle.PropertyCacheFile.flushAndCloseOutStream(out);
    }
}