public static java.util.List<java.io.File> listFiles(java.lang.String filePath) {
    java.io.File sourceDir = new java.io.File(filePath);
    if (sourceDir.exists()) {
        final java.io.File[] fileArray = sourceDir.listFiles();
        if (fileArray != null) {
            return java.util.Arrays.asList(fileArray);
        }
    }
    return null;
}