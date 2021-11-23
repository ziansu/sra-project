private static boolean hasValidFileName(java.nio.file.Path filePath) {
    boolean hasValidPeriodIndex = (filePath.getFileName().toString().lastIndexOf('.')) > 0;
    return hasValidPeriodIndex && ((!(java.nio.file.Files.exists(filePath))) || (java.nio.file.Files.isRegularFile(filePath)));
}