public static java.lang.String getStringResponse(java.io.InputStream is) {
    java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(is));
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    java.lang.String line = null;
    try {
        while ((line = reader.readLine()) != null) {
            sb.append((line + ""));
        } 
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return sb.toString();
}