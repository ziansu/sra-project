public org.json.JSONObject getServiceLanguagePairs(java.lang.String sourceLanguageCode) throws com.gengo.client.exceptions.GengoException {
    try {
        java.lang.String url = (this.getBaseUrl()) + "translate/service/language_pairs";
        org.json.JSONObject data = new org.json.JSONObject();
        data.put("lc_src", sourceLanguageCode);
        return call(url, HttpMethod.GET, data);
    } catch (org.json.JSONException e) {
        throw new com.gengo.client.exceptions.GengoException(e.getMessage(), e);
    }
}