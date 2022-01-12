public org.json.JSONObject postOrderComment(java.lang.Integer orderId, java.lang.String comment) throws com.gengo.client.exceptions.GengoException {
    try {
        java.lang.String url = (this.getBaseUrl()) + "translate/order/";
        url += orderId;
        url += "/comment";
        org.json.JSONObject data = new org.json.JSONObject();
        data.put("body", comment);
        return call(url, HttpMethod.POST, data);
    } catch (org.json.JSONException e) {
        throw new com.gengo.client.exceptions.GengoException(x.getMessage(), x);
    }
}