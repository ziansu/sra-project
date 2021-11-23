private java.lang.String readIt(java.io.InputStream stream) {
    try {
        java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(stream));
        java.lang.StringBuilder result = new java.lang.StringBuilder();
        java.lang.String line;
        while ((line = reader.readLine()) != null) {
            result.append(line);
        } 
        return result.toString();
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return "";
    }
}