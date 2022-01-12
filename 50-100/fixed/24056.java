public java.lang.String readStringFromInputStream(java.io.InputStream inputStream) throws java.io.IOException {
    java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream));
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    java.lang.String line;
    while ((line = reader.readLine()) != null) {
        sb.append(line).append("\n");
    } 
    return sb.toString();
}