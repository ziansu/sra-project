private org.apache.bookkeeper.bookie.BookieStatus readFromFile(java.io.File file) throws java.io.IOException, java.lang.IllegalArgumentException {
    if (!(file.exists())) {
        return null;
    }
    java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(file), com.google.common.base.Charsets.UTF_8));
    try {
        return parse(reader);
    } finally {
        reader.close();
    }
}