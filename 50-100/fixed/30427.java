public static final void write(final java.io.File file, final java.lang.String content) throws java.io.IOException {
    if (file.exists()) {
        file.delete();
    }
    file.createNewFile();
    java.io.FileOutputStream output = null;
    try {
        output = new java.io.FileOutputStream(file);
        output.write(content.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    } finally {
        output.close();
    }
}