public java.util.Map<java.lang.String, java.lang.String> sync() {
    try {
        java.lang.String jsonString = getUrlString(buildUrl());
        org.json.JSONObject jsonBody = new org.json.JSONObject(jsonString);
        return parseData(jsonBody);
    } catch (org.json.JSONException e) {
        android.util.Log.e(com.gmail.halfik.btcprice.model.FetchData.TAG, "failed to parse json", e);
    } catch (java.io.IOException ioe) {
        android.util.Log.e(com.gmail.halfik.btcprice.model.FetchData.TAG, "failed to fetch items", ioe);
    }
    return new java.util.HashMap<>();
}