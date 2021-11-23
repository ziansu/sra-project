public org.json.JSONObject reviseTranslationJob(int id, java.lang.String comments) throws com.gengo.client.exceptions.GengoException {
    try {
        java.lang.String url = ((this.getBaseUrl()) + "translate/job/") + id;
        org.json.JSONObject data = new org.json.JSONObject();
        data.put("action", "revise");
        data.put("comment", comments);
        return call(url, HttpMethod.PUT, data);
    } catch (org.json.JSONException e) {
        throw new com.gengo.client.exceptions.GengoException(x.getMessage(), x);
    }
}