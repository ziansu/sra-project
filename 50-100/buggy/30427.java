public static final void write(final java.io.File file, final java.lang.String content) throws java.io.IOException {
    if (file.exists()) {
        file.delete();
    }
    file.createNewFile();
    final java.io.FileOutputStream output = new java.io.FileOutputStream(file);
    output.write(content.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    output.close();
}