@java.lang.Override
public void deliverError(com.android.volley.VolleyError error) {
    super.deliverError(error);
    java.lang.String jsonResponse = null;
    try {
        jsonResponse = new java.lang.String(error.networkResponse.data, com.android.volley.toolbox.HttpHeaderParser.parseCharset(error.networkResponse.headers));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    android.util.Log.d("Error Response Body", jsonResponse);
}