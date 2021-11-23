private void closeDialog() {
    try {
        this.inAppWebView.loadUrl("about:blank");
        org.json.JSONObject obj = new org.json.JSONObject();
        obj.put("type", org.apache.cordova.plugins.InAppBrowser.EXIT_EVENT);
        sendUpdate(obj, false);
    } catch (org.json.JSONException ex) {
        android.util.Log.d(org.apache.cordova.plugins.InAppBrowser.LOG_TAG, "Should never happen");
    }
    if ((dialog) != null) {
        dialog.dismiss();
    }
}