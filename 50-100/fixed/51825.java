private java.lang.String readIt(java.io.InputStream stream) throws java.io.IOException {
    java.io.Reader reader = new java.io.InputStreamReader(stream, "UTF-8");
    java.io.BufferedReader bufReader = new java.io.BufferedReader(reader);
    java.lang.String line;
    java.lang.String result = "";
    while ((line = bufReader.readLine()) != null) {
        result += line.replaceAll("\\s+", "");
    } 
    return result;
}