private java.lang.String sendRedeemMCouponConfirmationToManufacturer(java.lang.String[] params) {
    org.json.JSONObject json = new org.json.JSONObject();
    json.put("nrid", params[3]);
    json.put("idmerchant", params[2]);
    json.put("signaturemerchant", params[1]);
    json.put("signatureissuer", params[0]);
    return json.toString();
}