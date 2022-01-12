@java.lang.Override
public void run() {
    com.marketo.MarketoConfig.Notification config = marketo.getNotificationConfig();
    org.json.JSONArray object = new org.json.JSONArray();
    object.put(BitMapPath(config.getNotificationLargeIcon()));
    object.put(getResourseName(config.getNotificationSmallIcon()));
    callbackContext.success(object);
}