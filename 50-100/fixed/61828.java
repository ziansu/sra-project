public static java.io.File createTempDir(java.lang.String prefix, java.io.File directory) {
    try {
        java.io.File tempFile = java.io.File.createTempFile(prefix, "", directory);
        if (tempFile == null) {
            return null;
        }
        if (!(tempFile.delete())) {
            return null;
        }
        if (!(tempFile.mkdir())) {
            return null;
        }
        return tempFile;
    } catch (java.lang.Exception e) {
        return null;
    }
}