private static java.lang.String readInputStream(java.io.InputStream is) throws java.io.IOException {
    java.io.BufferedReader r = new java.io.BufferedReader(new java.io.InputStreamReader(is));
    java.lang.StringBuilder total = new java.lang.StringBuilder();
    java.lang.String line;
    while ((line = r.readLine()) != null) {
        total.append(line);
    } 
    return total.toString();
}