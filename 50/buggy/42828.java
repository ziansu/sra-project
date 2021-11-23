private java.lang.String sendClearingToMerchant(java.lang.String[] params) {
    org.json.JSONObject json = new org.json.JSONObject();
    json.put("signaturemanufacturer", params[0]);
    json.put("rid", params[1]);
    return json.toString();
}