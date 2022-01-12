public boolean parseDeleteTaskResponse(java.lang.String webResponse) {
    try {
        jObject = new org.json.JSONObject(webResponse);
        isError = jObject.getBoolean("isError");
        message = jObject.getString("Message");
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return isError;
}