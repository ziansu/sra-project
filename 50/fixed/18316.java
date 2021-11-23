private static org.json.JSONArray getDocument(org.jsoup.nodes.Document document) throws org.json.JSONException {
    java.lang.String resumeListJson = document.select("body").text();
    org.json.JSONObject jsonObject = new org.json.JSONObject(resumeListJson);
    return jsonObject.getJSONArray("resumes");
}