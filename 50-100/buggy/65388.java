public org.json.JSONObject determineTranslationCost(com.gengo.client.payloads.Payloads jobs) throws com.gengo.client.exceptions.GengoException {
    try {
        java.lang.String url = (this.getBaseUrl()) + "translate/service/quote/";
        org.json.JSONObject data = new org.json.JSONObject();
        data.put("jobs", jobs.toJSONArray());
        return call(url, HttpMethod.POST, data);
    } catch (org.json.JSONException e) {
        throw new com.gengo.client.exceptions.GengoException(x.getMessage(), x);
    }
}