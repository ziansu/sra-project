private org.inaturalist.android.BetterJSONObject removeObservationFromProject(int observationId, int projectId) throws org.inaturalist.android.INaturalistService.AuthenticationException {
    if ((ensureCredentials()) == false) {
        return null;
    }
    java.lang.String url = java.lang.String.format("%s/projects/%d/remove.json?observation_id=%d", org.inaturalist.android.INaturalistService.HOST, projectId, observationId);
    org.json.JSONArray json = delete(url, null);
    if (json == null)
        return null;
    
    try {
        return new org.inaturalist.android.BetterJSONObject(json.getJSONObject(0));
    } catch (org.json.JSONException e) {
        e.printStackTrace();
        return new org.inaturalist.android.BetterJSONObject();
    }
}