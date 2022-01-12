public static java.lang.String get(java.lang.String urlName) {
    java.lang.String jsonResponse = "";
    java.net.HttpURLConnection connection = null;
    try {
        java.net.URL url = fatec.rest.helpers.HttpHelper.createURL(urlName);
        connection = fatec.rest.helpers.HttpHelper.openConnection(url, connection);
        int responseCode = fatec.rest.helpers.HttpHelper.getResponseCode(connection);
        jsonResponse = fatec.rest.helpers.HttpHelper.readResponse(responseCode, connection);
    } catch (java.io.IOException | java.lang.RuntimeException exc) {
        jsonResponse = exc.getMessage();
    }
    return jsonResponse;
}