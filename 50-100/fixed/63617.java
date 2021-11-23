private com.buddy.sdk.BuddyClientImpl.BuddyClientSettings getSettings() {
    if ((settings) == null) {
        android.content.SharedPreferences preferences = getPreferences();
        if (preferences != null) {
            java.lang.String json = preferences.getString(this.app_id, null);
            if (json != null) {
                settings = new com.google.gson.Gson().fromJson(json, com.buddy.sdk.BuddyClientImpl.BuddyClientSettings.class);
            }
        }
        if ((settings) == null) {
            settings = new com.buddy.sdk.BuddyClientImpl.BuddyClientSettings();
        }
    }
    return settings;
}