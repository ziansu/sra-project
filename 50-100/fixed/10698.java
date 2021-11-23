public static void setFloat(java.lang.String group, java.lang.String param, float value) {
    if (!(Config.data.hasKey(group)))
        Config.data.setJSONObject(group, new processing.data.JSONObject());
    
    processing.data.JSONObject grp = Config.data.getJSONObject(group);
    grp.setFloat(param, value);
    Config.data.setJSONObject(group, grp);
    Config.modified = true;
}