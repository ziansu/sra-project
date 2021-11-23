public static java.io.BufferedReader getReader(java.io.File file) throws java.io.IOException {
    java.io.FileInputStream stream = new java.io.FileInputStream(file);
    if (file.getName().endsWith(".gz")) {
        return new java.io.BufferedReader(new java.io.InputStreamReader(new java.util.zip.GZIPInputStream(stream)));
    }else {
        return new java.io.BufferedReader(new java.io.InputStreamReader(stream));
    }
}