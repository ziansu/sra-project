protected void saveInstallationId() {
    final android.content.SharedPreferences.Editor editor = getSharedPreferences().edit();
    final java.lang.String json = new org.json.JSONArray().put(id).toString();
    editor.putString(com.strongloop.android.loopback.LocalInstallation.PROPERTY_INSTALLATION_ID, json);
    editor.commit();
}