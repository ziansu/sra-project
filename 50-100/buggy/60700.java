private org.inaturalist.android.BetterJSONObject getProjectIdentifiers(int projectId) throws org.inaturalist.android.INaturalistService.AuthenticationException {
    java.lang.String url = ((org.inaturalist.android.INaturalistService.API_HOST) + "/observations/identifiers?project_id=") + projectId;
    org.json.JSONArray json = get(url);
    try {
        return new org.inaturalist.android.BetterJSONObject(json.getJSONObject(0));
    } catch (org.json.JSONException e) {
        e.printStackTrace();
        return new org.inaturalist.android.BetterJSONObject();
    }
}