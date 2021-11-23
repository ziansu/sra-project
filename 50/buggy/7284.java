private java.lang.String getRegionFromDefaultModelSettings(java.lang.String defaultModelSettingsString) {
    org.json.JSONObject defaultModelSettings = new org.json.JSONObject(defaultModelSettingsString);
    return defaultModelSettings.has("region") ? defaultModelSettings.getString("region") : "";
}