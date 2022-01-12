protected org.json.JSONObject sendAndReturnObject(java.lang.String method, java.lang.String urlString, org.json.JSONObject parameters) {
    java.lang.String content = getContentString(method, urlString, parameters);
    try {
        org.json.JSONObject response = new org.json.JSONObject(content);
        handleJSONError(response);
        return response;
    } catch (java.lang.Exception e) {
        alertError("There was an error connecting to the server.");
    }
    return null;
}