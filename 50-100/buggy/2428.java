public void write(java.io.File file, java.nio.charset.Charset charset, java.lang.String... content) throws java.io.IOException {
    java.io.PrintWriter writer = null;
    try {
        writer = new java.io.PrintWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(file), charset));
        for (java.lang.String line : content) {
            writer.println(line);
        }
    } finally {
        org.assertj.core.util.Closeables.closeQuietly(writer);
    }
}