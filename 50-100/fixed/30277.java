private void handleEditorBindingsCleared(org.json.JSONObject clearMessage) {
    try {
        final org.json.JSONObject payload = clearMessage.getJSONObject("payload");
        final org.json.JSONArray actions = payload.getJSONArray("actions");
        for (int i = 0; i < (actions.length()); i++) {
            final java.lang.String changeId = actions.getString(i);
            mEditorChanges.remove(changeId);
        }
    } catch (final org.json.JSONException e) {
        android.util.Log.e(com.mixpanel.android.viewcrawler.ViewCrawler.LOGTAG, "Bad clear request received", e);
    }
    applyVariantsAndEventBindings(false);
}