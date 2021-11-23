private java.lang.String createJsonStringFromInputStream(java.io.InputStream inputStream) {
    try {
        java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream, "iso-8859-1"), 8);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String line = null;
        while ((line = reader.readLine()) != null)
            sb.append((line + "\n"));
        
        inputStream.close();
        com.example.celien.drivemycar.http.JsonParser.json = sb.toString();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return com.example.celien.drivemycar.http.JsonParser.json;
}