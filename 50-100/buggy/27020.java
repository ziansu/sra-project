private static com.adobe.internal.io.ByteWriter getByteWriterFromFile(final java.lang.String outputPath) throws java.io.IOException {
    final java.io.File file = new java.io.File(outputPath);
    if (file.exists()) {
        java.nio.file.Files.delete(file.toPath());
    }
    final java.io.RandomAccessFile outputPdfFile = new java.io.RandomAccessFile(file, "rw");
    return new com.adobe.internal.io.RandomAccessFileByteWriter(outputPdfFile);
}