public org.json.JSONObject archiveTranslationJobs(java.util.List<java.lang.Integer> jobs) throws com.gengo.client.exceptions.GengoException {
    try {
        java.lang.String url = (this.getBaseUrl()) + "translate/jobs";
        org.json.JSONObject data = new org.json.JSONObject();
        data.put("action", "archive");
        data.put("job_ids", jobs);
        return call(url, HttpMethod.PUT, data);
    } catch (org.json.JSONException e) {
        throw new com.gengo.client.exceptions.GengoException(e.getMessage(), e);
    }
}