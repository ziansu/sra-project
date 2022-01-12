protected org.json.JSONObject sendAndReturnObject(java.lang.String method, java.lang.String urlString, org.json.JSONObject parameters) {
    java.lang.String content = getContentString(method, urlString, parameters);
    org.json.JSONObject response = null;
    try {
        response = new org.json.JSONObject(content);
        handleJSONError(response);
    } catch (java.lang.Exception e) {
        alertError("There was an error connecting to the server.");
        response = null;
    }
    return response;
}