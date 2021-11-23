private void readConnection() throws java.io.IOException {
    responseCode = urlConnection.getResponseCode();
    java.lang.String message = urlConnection.getResponseMessage();
    if ((responseCode) == 200) {
        java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(urlConnection.getInputStream()));
        java.lang.String line;
        while ((line = reader.readLine()) != null) {
            response += line + "\n";
        } 
        reader.close();
    }else {
        response = message;
    }
}