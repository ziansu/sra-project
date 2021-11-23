private java.lang.String readIt(java.io.InputStream stream) throws java.io.IOException, java.io.UnsupportedEncodingException {
    java.io.Reader reader = null;
    java.io.BufferedReader bufReader = null;
    reader = new java.io.InputStreamReader(stream, "UTF-8");
    bufReader = new java.io.BufferedReader(reader);
    java.lang.String line;
    java.lang.String result = "";
    while ((line = bufReader.readLine()) != null) {
        result += line.replaceAll("\\s+", "");
    } 
    return result;
}