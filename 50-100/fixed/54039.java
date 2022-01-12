private java.lang.String readIt(java.io.InputStream is, int len) throws java.io.IOException {
    java.io.Reader reader = null;
    reader = new java.io.InputStreamReader(is, "UTF-8");
    char[] buffer = new char[len];
    java.lang.String content = "";
    int readLen;
    do {
        readLen = reader.read(buffer);
        if (readLen > 0) {
            content += new java.lang.String(buffer).substring(0, readLen);
        }
    } while (readLen > 0 );
    return content;
}