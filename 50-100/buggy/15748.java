private void addProjectField(int fieldId) throws org.inaturalist.android.INaturalistService.AuthenticationException {
    try {
        org.json.JSONArray result = get(java.lang.String.format("%s/observation_fields/%d.json", org.inaturalist.android.INaturalistService.HOST, fieldId));
        org.inaturalist.android.BetterJSONObject jsonObj;
        jsonObj = new org.inaturalist.android.BetterJSONObject(result.getJSONObject(0));
        org.inaturalist.android.ProjectField field = new org.inaturalist.android.ProjectField(jsonObj);
        getContentResolver().insert(ProjectField.CONTENT_URI, field.getContentValues());
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}