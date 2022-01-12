public static java.lang.String downloadPage(final java.io.InputStream is) throws java.io.IOException {
    final java.lang.StringBuilder sb = new java.lang.StringBuilder();
    byte[] buffer = new byte[Constants.BUFFER_SIZE];
    int size;
    while ((size = is.read(buffer)) != (-1))
        sb.append(new java.lang.String(buffer, 0, size));
    
    return sb.toString();
}