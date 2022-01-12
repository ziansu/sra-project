public static org.json.JSONObject convertToJSON(float[] data) throws org.json.JSONException {
    org.json.JSONObject jsonObject = new org.json.JSONObject();
    char prefix = 'x';
    for (int i = 0; i < (data.length); i++) {
        jsonObject.put(java.lang.String.valueOf(prefix), data[i]);
        prefix++;
    }
    return jsonObject;
}