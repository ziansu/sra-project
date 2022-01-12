private java.lang.String readIt(java.io.InputStream is, int len) throws java.io.IOException {
    java.io.Reader reader = null;
    reader = new java.io.InputStreamReader(is, "UTF-8");
    char[] buffer = new char[len];
    java.lang.String content = "";
    int readLen;
    do {
        readLen = reader.read(buffer);
        content += new java.lang.String(buffer).substring(0, readLen);
    } while (readLen == len );
    return content;
}