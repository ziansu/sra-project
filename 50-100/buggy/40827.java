private void readQueryData(java.lang.String queryFilePath) {
    queries = new java.util.ArrayList<java.lang.String>();
    try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(queryFilePath))) {
        java.lang.String line = reader.readLine();
        while ((line != null) && (line != "")) {
            queries.add(line);
        } 
    } catch (java.io.IOException e) {
    }
}