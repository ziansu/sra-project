@java.lang.Override
public void onFinish(ir.afshin.netup.Requests.Request request, java.lang.String response, boolean success, java.net.HttpURLConnection connection, ir.afshin.netup.base.ConnectionStatus status) {
    org.json.JSONArray jsonObject = null;
    if (success) {
        try {
            jsonObject = new org.json.JSONArray(response);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
    if ((listener) != null)
        listener.onFinish(this, jsonObject, success, connection, status);
    
}