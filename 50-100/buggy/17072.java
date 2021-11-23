public static java.io.PrintWriter getPrintWriter(java.io.File file, boolean append) throws java.io.IOException {
    java.io.OutputStream os = new java.io.FileOutputStream(file, append);
    if (file.getName().endsWith(".gz")) {
        os = new java.util.zip.GZIPOutputStream(os);
        if ((file.exists()) && append) {
            throw new java.lang.IllegalArgumentException("Can't append to gzipped file");
        }
    }
    return new java.io.PrintWriter(new java.io.OutputStreamWriter(os, "UTF8"));
}