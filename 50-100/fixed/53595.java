public java.util.List<java.lang.String> getLines() throws java.io.IOException {
    java.util.List<java.lang.String> result;
    try (java.io.ByteArrayInputStream is = new java.io.ByteArrayInputStream(forkedStream.toByteArray())) {
        result = org.apache.commons.io.IOUtils.readLines(is);
    }
    forkedStream.close();
    return result;
}