private java.io.File writeTempFile(java.util.List<java.lang.Float> records) throws java.io.IOException {
    java.io.File file = java.io.File.createTempFile("tempfile", ".tmp");
    try (java.io.PrintWriter out = new java.io.PrintWriter(file.getAbsoluteFile())) {
        records.forEach(out::println);
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException("Error in writing temp File!");
    }
    records.clear();
    return file;
}