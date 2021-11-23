public org.json.JSONObject archiveTranslationJob(int id) throws com.gengo.client.exceptions.GengoException {
    try {
        java.lang.String url = ((this.getBaseUrl()) + "translate/job/") + id;
        org.json.JSONObject data = new org.json.JSONObject();
        data.put("action", "archive");
        return call(url, HttpMethod.PUT, data);
    } catch (org.json.JSONException e) {
        throw new com.gengo.client.exceptions.GengoException(e.getMessage(), e);
    }
}