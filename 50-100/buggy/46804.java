public static void fileWrite(java.io.File file, java.lang.String encoding, java.lang.String data) throws java.io.IOException {
    java.io.Writer writer = null;
    try {
        java.io.OutputStream out = new java.io.FileOutputStream(file);
        if (encoding != null) {
            writer = new java.io.OutputStreamWriter(out, encoding);
        }else {
            writer = new java.io.OutputStreamWriter(out);
        }
        writer.write(data);
    } finally {
        org.codehaus.plexus.util.IOUtil.close(writer);
    }
}