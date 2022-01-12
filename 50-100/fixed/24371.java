private java.lang.String getResponseString(org.apache.http.HttpResponse lastResponse) {
    java.lang.StringBuilder result = new java.lang.StringBuilder();
    try (java.io.BufferedReader rd = new java.io.BufferedReader(new java.io.InputStreamReader(lastResponse.getEntity().getContent()))) {
        java.lang.String line;
        while ((line = rd.readLine()) != null) {
            result.append(line);
        } 
    } catch (java.io.IOException ex) {
        ex.printStackTrace();
    }
    return result.toString();
}