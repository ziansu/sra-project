public void error(java.lang.String failingUrl, java.lang.String errorCode, java.lang.String description) {
    try {
        org.json.JSONObject response = CreateResponse(BrowserEventSender.LOAD_ERROR_EVENT);
        response.put("url", failingUrl);
        response.put("code", errorCode);
        response.put("message", description);
        sendErrorUpdate(response);
    } catch (org.json.JSONException ex) {
        android.util.Log.d(BrowserEventSender.LOG_TAG, "Failed to build error response object");
    }
}