@java.lang.Override
public void run() {
    try {
        android.util.Log.v(com.smartdevicelink.api.SdlApplication.TAG, response.serializeJSON().toString(3));
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    if (listener != null)
        listener.onResponse(correlationId, response);
    
    request.setOnRPCResponseListener(listener);
}