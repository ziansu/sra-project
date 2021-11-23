private void recordExtension(java.lang.String fileName) {
    java.lang.String[] tokens = fileName.split("\\.");
    if ((tokens.length) > 0) {
        java.lang.String extension = tokens[((tokens.length) - 1)];
        extensionsFound.add(extension.toLowerCase());
    }
}