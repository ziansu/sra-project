public void sendOpenEvent(java.lang.String pageId) {
    try {
        org.json.JSONObject payload = makePageIdPayload(pageId);
        sendEvent("open", payload);
    } catch (org.json.JSONException e) {
        com.facebook.common.logging.FLog.e(com.facebook.react.devsupport.InspectorPackagerConnection.TAG, "Failed to open page", e);
    }
}