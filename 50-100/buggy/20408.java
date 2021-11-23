@java.lang.Override
protected void decode() {
    org.json.simple.JSONArray follows = ((org.json.simple.JSONArray) (self.get("follows")));
    for (int i = 0; i < ((follows.size()) - 1); i++) {
        org.gdesign.twitch.api.json.type.TChannel c = new org.gdesign.twitch.api.json.type.TChannel(((org.json.simple.JSONObject) (follows.get(i))));
        values.put(c.values.get("display_name").toString().toLowerCase(), c);
    }
}