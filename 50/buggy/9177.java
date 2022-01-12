public com.oltpbenchmark.util.json.JSONArray put(double value) throws com.oltpbenchmark.util.json.JSONException {
    java.lang.Double d = new java.lang.Double(value);
    com.oltpbenchmark.util.json.JSONObject.testValidity(d);
    put(d);
    return this;
}