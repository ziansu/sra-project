private boolean parseRateFromJSONString(java.lang.String result) {
    boolean updateSuccess = false;
    try {
        org.json.JSONObject json = new org.json.JSONObject(result);
        double rate = json.getDouble(com.llamacorp.equate.UnitCurrency.JSON_URL_RATE_TAG);
        setValue(rate);
        updateSuccess = true;
    } catch (org.json.JSONException e) {
    }
    return updateSuccess;
}