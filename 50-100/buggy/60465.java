@java.lang.Override
protected void decodeResponseText(java.lang.String responseText) {
    try {
        org.json.JSONObject obj = new org.json.JSONObject(responseText);
        if (obj.getBoolean(com.rbfautomation.network.responses.RESULT)) {
            mToken = obj.getString("token");
        }else {
            setError(obj.getInt(com.rbfautomation.network.responses.ERROR_CODE), obj.getString(com.rbfautomation.network.responses.MESSAGE));
        }
    } catch (org.json.JSONException e) {
        e.printStackTrace();
        setError(ErrorCodes.JSON_PARSE_ERROR, e.getMessage());
    }
}