public void purgeSpaces(org.json.JSONArray spaces) {
    for (int i = 0; i < (spaces.length()); i++) {
        try {
            org.json.JSONObject space = spaces.getJSONObject(i);
            org.exoplatform.container.component.RequestLifeCycle.begin(org.exoplatform.container.ExoContainerContext.getCurrentContainer());
            purgeSpace(space.getString("displayName"));
            org.exoplatform.container.component.RequestLifeCycle.end();
        } catch (org.json.JSONException e) {
            LOG.error(("Syntax error on space n°" + i), e);
        }
    }
}