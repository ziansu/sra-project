private void schedule(org.json.JSONArray notifications) {
    for (int i = 0; i < (notifications.length()); i++) {
        org.json.JSONObject options = notifications.optJSONObject(i);
        try {
            de.appplant.cordova.plugin.notification.Notification notification = getNotificationMgr().schedule(options, de.appplant.cordova.plugin.localnotification.TriggerReceiver.class);
            de.appplant.cordova.plugin.localnotification.LocalNotification.fireEvent("schedule", notification);
        } catch (java.lang.Exception generic) {
        }
    }
}