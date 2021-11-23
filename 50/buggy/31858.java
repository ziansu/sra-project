public static java.io.InputStream StringTOInputStream(java.lang.String in) throws java.lang.Exception {
    java.io.ByteArrayInputStream is = new java.io.ByteArrayInputStream(in.getBytes("ISO-8859-1"));
    return is;
}