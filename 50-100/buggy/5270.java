private void encodeMatrices(org.json.JSONObject obj, java.lang.String key, java.util.List<float[]> payload) throws org.json.JSONException {
    org.json.JSONArray arr = new org.json.JSONArray();
    for (float[] payloadMat : payload) {
        arr.put(new org.json.JSONArray(payloadMat));
    }
    obj.put(key, arr);
}