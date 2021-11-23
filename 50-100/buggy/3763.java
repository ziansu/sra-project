protected java.io.File createTempFile() throws java.io.IOException {
    final java.io.File file = newFile();
    if ((forceContent) && ((contentUrl) == null)) {
        throw new java.lang.AssertionError("ContentUrl is not set");
    }else
        if ((contentUrl) != null) {
            try (java.io.InputStream inputStream = contentUrl.openStream()) {
                java.nio.file.Files.copy(inputStream, file.toPath());
            }
        }else {
            file.createNewFile();
        }
    
    return file;
}