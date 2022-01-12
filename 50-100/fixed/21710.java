public static org.json.JSONObject convertToJSON(float[] data) throws org.json.JSONException {
    org.json.JSONObject jsonObject = new org.json.JSONObject();
    if (data == null) {
        return jsonObject;
    }else {
        char prefix = 'x';
        for (int i = 0; i < (data.length); i++) {
            jsonObject.put(java.lang.String.valueOf(prefix), data[i]);
            prefix++;
        }
        return jsonObject;
    }
}