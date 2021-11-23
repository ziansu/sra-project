private java.lang.String inputStreamToString(final java.io.InputStream is) throws java.io.IOException {
    java.lang.String line;
    java.lang.StringBuilder total = new java.lang.StringBuilder();
    java.io.BufferedReader rd = new java.io.BufferedReader(new java.io.InputStreamReader(is));
    while ((line = rd.readLine()) != null) {
        total.append(line);
    } 
    return total.toString();
}