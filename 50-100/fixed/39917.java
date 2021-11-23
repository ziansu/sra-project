private org.inaturalist.android.SerializableJSONArray getTaxaForGuide(java.lang.Integer guideId) throws org.inaturalist.android.INaturalistService.AuthenticationException {
    java.lang.String url = ((org.inaturalist.android.INaturalistService.HOST) + "/guide_taxa.json?guide_id=") + (guideId.toString());
    org.json.JSONArray json = get(url);
    try {
        if (json == null)
            return new org.inaturalist.android.SerializableJSONArray();
        
        return new org.inaturalist.android.SerializableJSONArray(json.getJSONObject(0).getJSONArray("guide_taxa"));
    } catch (org.json.JSONException e) {
        e.printStackTrace();
        return new org.inaturalist.android.SerializableJSONArray();
    }
}