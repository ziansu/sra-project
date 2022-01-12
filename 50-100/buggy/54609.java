public synchronized void process(java.lang.String inputContent, java.io.File outputFile, java.lang.String encoding) throws java.io.IOException {
    filter.reset();
    java.io.Reader input = new java.io.InputStreamReader(new java.io.ByteArrayInputStream(inputContent.getBytes()), encoding);
    try {
        java.io.Writer output = new java.io.OutputStreamWriter(new java.io.FileOutputStream(outputFile), encoding);
        try {
            process(input, output);
        } finally {
            output.close();
        }
    } finally {
        input.close();
    }
}