private static void saveOrig(java.nio.file.Path propFile) throws java.io.IOException {
    final java.nio.file.Path bakFile = propFile.resolveSibling(((propFile.getFileName()) + ".orig"));
    if (!(java.nio.file.Files.exists(bakFile))) {
        java.nio.file.Files.copy(propFile, bakFile, java.nio.file.StandardCopyOption.REPLACE_EXISTING);
    }
}