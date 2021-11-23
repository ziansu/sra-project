public static com.devicehive.util.DeviceNotificationMessage createNotificationForDevice(com.devicehive.util.Device device, java.lang.String notificationName) {
    com.devicehive.util.DeviceNotificationMessage notification = new com.devicehive.util.DeviceNotificationMessage();
    notification.setNotification(notificationName);
    notification.setDeviceGuid(device.getGuid());
    com.google.gson.Gson gson = com.devicehive.json.GsonFactory.createGson(JsonPolicyDef.Policy.DEVICE_PUBLISHED);
    com.google.gson.JsonElement deviceAsJson = gson.toJsonTree(device);
    notification.setParameters(deviceAsJson.getAsJsonObject().getAsString());
    return notification;
}