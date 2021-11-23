public java.util.List<java.lang.String> getLines() throws java.io.IOException {
    java.io.ByteArrayInputStream is = new java.io.ByteArrayInputStream(forkedStream.toByteArray());
    java.util.List<java.lang.String> result = org.apache.commons.io.IOUtils.readLines(is);
    is.close();
    forkedStream.close();
    return result;
}