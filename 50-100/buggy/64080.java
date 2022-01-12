private void syncBaseOnClient() throws org.json.JSONException {
    java.lang.System.out.println("syncBaseOnClient");
    org.json.JSONObject setting = userData.getJSONObject("setting");
    db.updateSetting(setting.getBoolean("wifi_sync"), setting.getBoolean("mobile_network_sync"), new java.sql.Timestamp(syncTimeStamp).toString(), userId);
    java.lang.System.out.println("remove all setting");
    db.deleteUserHasVersion(userId);
    db.deleteBookmark(userId);
    java.lang.System.out.println("folderSyncBaseOnClient");
    java.lang.System.out.println("packSyncBaseOnClient");
    packSyncBaseOnClient();
    folderSyncBaseOnClient();
}