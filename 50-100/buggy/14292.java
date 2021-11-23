public static void replaceInFile(java.lang.String replace, java.lang.String with, java.nio.file.Path file) throws java.io.IOException {
    com.google.common.base.Preconditions.checkNotNull(replace);
    com.google.common.base.Preconditions.checkNotNull(with);
    com.google.common.base.Preconditions.checkNotNull(file);
    byte[] fileAsBytes = java.nio.file.Files.readAllBytes(file);
    java.lang.String fileAsString = new java.lang.String(fileAsBytes);
    fileAsString = fileAsString.replaceAll(replace, with);
    java.nio.file.Files.write(file, fileAsString.getBytes(), java.nio.file.StandardOpenOption.TRUNCATE_EXISTING);
}