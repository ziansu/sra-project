private org.inaturalist.android.BetterJSONObject getProjectObservations(int projectId) throws org.inaturalist.android.INaturalistService.AuthenticationException {
    java.lang.String url = (((org.inaturalist.android.INaturalistService.API_HOST) + "/observations?project_id=") + projectId) + "&per_page=200";
    org.json.JSONArray json = get(url);
    try {
        return new org.inaturalist.android.BetterJSONObject(json.getJSONObject(0));
    } catch (org.json.JSONException e) {
        e.printStackTrace();
        return new org.inaturalist.android.BetterJSONObject();
    }
}