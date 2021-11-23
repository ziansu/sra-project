public void compressCss(java.util.Collection<java.io.File> files, java.io.OutputStream outputStream) throws java.io.IOException {
    for (java.io.File file : files) {
        com.yahoo.platform.yui.compressor.CssCompressor compressor = new com.yahoo.platform.yui.compressor.CssCompressor(new java.io.FileReader(file));
        try (java.io.Writer writer = new java.io.OutputStreamWriter(outputStream, charset)) {
            compressor.compress(writer, linebreakPosition);
        }
    }
}