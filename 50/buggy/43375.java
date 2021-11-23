private java.lang.String loadInputStream(java.io.InputStream is) throws java.io.IOException {
    java.io.StringWriter sw = new java.io.StringWriter();
    org.apache.commons.io.IOUtils.copy(is, sw);
    return sw.toString();
}