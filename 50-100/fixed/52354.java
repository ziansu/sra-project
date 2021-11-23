public org.json.JSONObject postTranslationJobComment(int id, java.lang.String comment) throws com.gengo.client.exceptions.GengoException {
    try {
        java.lang.String url = (((this.getBaseUrl()) + "translate/job/") + id) + "/comment";
        org.json.JSONObject data = new org.json.JSONObject();
        data.put("body", comment);
        return call(url, HttpMethod.POST, data);
    } catch (org.json.JSONException e) {
        throw new com.gengo.client.exceptions.GengoException(e.getMessage(), e);
    }
}