private java.lang.String[] splitBySlashAndDecode(java.lang.String connectionString) throws java.io.UnsupportedEncodingException {
    java.lang.String[] split = connectionString.split("/");
    for (int i = 0; i < (split.length); i++) {
        split[i] = java.net.URLDecoder.decode(split[1], "UTF-8");
    }
    return split;
}