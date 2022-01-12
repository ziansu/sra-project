public java.lang.String readIt(java.io.InputStream stream, int len) throws java.io.IOException, java.io.UnsupportedEncodingException {
    java.io.Reader reader = null;
    reader = new java.io.InputStreamReader(stream, "UTF-8");
    char[] buffer = new char[len];
    reader.read(buffer);
    return new java.lang.String(buffer);
}