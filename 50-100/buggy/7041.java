private java.lang.String[] solveConfirmationRedeemMCoupon(java.lang.String message) {
    org.json.JSONObject json = new org.json.JSONObject(message);
    java.lang.String[] params = new java.lang.String[4];
    params[0] = json.getString("nrid");
    params[1] = json.getString("idmerchant");
    params[2] = json.getString("signaturemerchant");
    params[3] = json.getString("signatureissuer");
    return params;
}