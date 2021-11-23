public static java.lang.String readRequestFile(java.lang.String fileName) throws java.lang.Exception {
    java.io.InputStream is = new java.io.FileInputStream(fileName);
    java.io.BufferedReader buf = new java.io.BufferedReader(new java.io.InputStreamReader(is));
    java.lang.String line = buf.readLine();
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    while (line != null) {
        sb.append(line).append("\n");
        line = buf.readLine();
    } 
    return sb.toString();
}