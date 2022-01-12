@java.lang.Override
public com.elfec.ssc.model.security.SscToken convert(java.lang.String result) {
    try {
        org.json.JSONObject json = new org.json.JSONObject(result);
        return new com.elfec.ssc.model.security.SscToken(json.getString("imei"), json.getString("token"));
    } catch (org.json.JSONException | java.lang.NullPointerException e) {
        android.util.Log.d("Convert Exception", e.getMessage());
    }
    return null;
}