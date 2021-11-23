@java.lang.Override
protected void decodeResponseText(java.lang.String responseText) {
    try {
        org.json.JSONObject obj = new org.json.JSONObject(responseText);
        if (obj.getBoolean(com.rbfautomation.network.responses.RESULT)) {
            mUsername = obj.getString("username");
        }
    } catch (org.json.JSONException e) {
        e.printStackTrace();
        setError(ErrorCodes.JSON_PARSE_ERROR, e.getMessage());
    }
}