public static void fileAppend(java.lang.String fileName, java.lang.String encoding, java.lang.String data) throws java.io.IOException {
    java.io.FileOutputStream out = null;
    try {
        out = new java.io.FileOutputStream(fileName, true);
        if (encoding != null) {
            out.write(data.getBytes(encoding));
        }else {
            out.write(data.getBytes());
        }
        out.close();
        out = null;
    } finally {
        org.codehaus.plexus.util.IOUtil.close(out);
    }
}