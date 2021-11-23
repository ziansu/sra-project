public static void exportResource(java.lang.String resourceName, java.nio.file.Path destination) throws java.io.IOException {
    try (java.io.InputStream in = com.github.checkstyle.FilesystemUtils.class.getResourceAsStream(resourceName);java.io.OutputStream out = java.nio.file.Files.newOutputStream(destination)) {
        int readBytes;
        final byte[] buffer = new byte[com.github.checkstyle.FilesystemUtils.BUFFER_SIZE];
        while ((readBytes = in.read(buffer)) > 0) {
            out.write(buffer, 0, com.github.checkstyle.FilesystemUtils.BUFFER_SIZE);
        } 
    }
}