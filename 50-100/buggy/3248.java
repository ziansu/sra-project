private static java.lang.String getFromStream(java.io.InputStream inputStream) throws java.io.IOException {
    java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream));
    java.lang.StringBuilder buffer = new java.lang.StringBuilder();
    java.lang.String line;
    while ((line = reader.readLine()) != null) {
        buffer.append(line);
    } 
    return buffer.toString();
}