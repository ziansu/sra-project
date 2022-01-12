@java.lang.Override
public com.elfec.ssc.model.security.SscToken convert(java.lang.String result) {
    try {
        if (result == null)
            return null;
        
        org.json.JSONObject json = new org.json.JSONObject(result);
        return new com.elfec.ssc.model.security.SscToken(json.getString("imei"), json.getString("token"));
    } catch (org.json.JSONException e) {
        android.util.Log.d("Convert Exception", e.toString());
    }
    return null;
}