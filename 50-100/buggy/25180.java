protected org.json.JSONArray sendAndReturnArray(java.lang.String method, java.lang.String urlString, org.json.JSONObject parameters) {
    java.lang.String content = getContentString(method, urlString, parameters);
    try {
        return new org.json.JSONArray(content);
    } catch (java.lang.Exception e) {
        try {
            org.json.JSONObject response = new org.json.JSONObject(content);
            handleJSONError(response);
        } catch (java.lang.Exception e2) {
            alertError("There was an error connecting to the server.");
        }
        return null;
    }
}