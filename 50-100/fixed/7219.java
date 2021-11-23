private java.lang.String readStream(java.io.InputStream in) throws java.io.IOException {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(in, "utf-8"))) {
        java.lang.String line = reader.readLine();
        while (line != null) {
            sb.append(line.trim());
            line = reader.readLine();
        } 
    }
    return sb.toString();
}