public java.lang.String getStringExtra(java.lang.String key) {
    java.lang.String result = null;
    if (null != (m_extras)) {
        try {
            org.json.JSONObject asObj = new org.json.JSONObject(m_extras);
            result = asObj.optString(key);
            if (0 == (result.length())) {
                result = null;
            }
        } catch (org.eehouse.android.xw4.jni.org.json ex) {
            org.eehouse.android.xw4.Log.ex(org.eehouse.android.xw4.jni.GameSummary.TAG, ex);
        }
    }
    org.eehouse.android.xw4.Log.i(org.eehouse.android.xw4.jni.GameSummary.TAG, "getStringExtra(%s) => %s", key, result);
    return result;
}