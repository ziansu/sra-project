@java.lang.Override
public void onMessage(okhttp3.WebSocket webSocket, java.lang.String text) {
    super.onMessage(webSocket, text);
    org.json.JSONObject obj;
    try {
        obj = new org.json.JSONObject(text);
        output(obj);
    } catch (org.json.JSONException ex) {
        ex.printStackTrace();
    }
}