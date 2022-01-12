public void purgeSpaces(org.json.JSONArray spaces) {
    for (int i = 0; i < (spaces.length()); i++) {
        try {
            org.json.JSONObject space = spaces.getJSONObject(i);
            purgeSpace(space.getString("displayName"));
        } catch (org.json.JSONException e) {
            LOG.error(("Syntax error on space n°" + i), e);
        }
    }
}