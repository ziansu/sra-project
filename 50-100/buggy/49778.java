@java.lang.Override
public void onMessage(okhttp3.WebSocket webSocket, java.lang.String text) {
    super.onMessage(webSocket, text);
    org.json.JSONObject obj;
    try {
        obj = new org.json.JSONObject(text);
        java.lang.String currency = obj.getString("cryptoCurrency");
        java.lang.String price = obj.getString("price");
        output(obj);
    } catch (org.json.JSONException ex) {
        ex.printStackTrace();
    }
    android.util.Log.d(TAG, text);
}