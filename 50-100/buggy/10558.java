public static java.util.List<com.teinproductions.tein.papyrosprogress.Milestone> getMilestones(java.lang.String json) throws java.text.ParseException, org.json.JSONException {
    org.json.JSONArray jArray = new org.json.JSONArray(json);
    java.util.List<com.teinproductions.tein.papyrosprogress.Milestone> result = new java.util.ArrayList<>();
    for (int i = 0; i < (result.size()); i++) {
        result.add(com.teinproductions.tein.papyrosprogress.JSONUtils.getMilestone(jArray.getJSONObject(i)));
    }
    return result;
}