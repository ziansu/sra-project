private java.nio.file.FileSystem newZipFileSystem(final java.io.File file) throws java.io.IOException {
    final java.util.Map<java.lang.String, java.lang.String> env = new java.util.HashMap<>();
    env.put("create", "true");
    return java.nio.file.FileSystems.newFileSystem(java.net.URI.create(("jar:" + (file.toURI()))), env);
}