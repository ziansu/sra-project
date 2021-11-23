public void compressJs(java.util.Collection<java.io.File> files, java.io.OutputStream outputStream) throws java.io.IOException {
    for (java.io.File file : files) {
        com.yahoo.platform.yui.compressor.JavaScriptCompressor compressor = new com.yahoo.platform.yui.compressor.JavaScriptCompressor(new java.io.FileReader(file), new com.github.vincentrussell.filter.webapp.performance.compress.util.Compressor.DefaultErrorReporter(file));
        try (java.io.Writer writer = new java.io.OutputStreamWriter(outputStream, charset)) {
            compressor.compress(writer, linebreakPosition, munge, verbose, preserveAllSemiColons, disableOptimizations);
        }
    }
}