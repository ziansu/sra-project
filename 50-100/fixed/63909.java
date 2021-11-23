private void update(org.json.JSONArray updates) {
    for (int i = 0; i < (updates.length()); i++) {
        org.json.JSONObject update = updates.optJSONObject(i);
        int id = this.idTable.get(update.get("id"));
        de.appplant.cordova.plugin.notification.Notification notification = getNotificationMgr().update(id, update, de.appplant.cordova.plugin.localnotification.TriggerReceiver.class);
        de.appplant.cordova.plugin.localnotification.LocalNotification.fireEvent("update", notification);
    }
}