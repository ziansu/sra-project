private static java.lang.String inputStreamToString(java.io.InputStream is) throws java.io.IOException {
    java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(is));
    java.lang.StringBuilder responseStringBuilder = new java.lang.StringBuilder();
    java.lang.String line = "";
    while ((line = reader.readLine()) != null) {
        responseStringBuilder.append(line);
    } 
    return responseStringBuilder.toString();
}