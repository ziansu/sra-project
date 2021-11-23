@java.lang.Override
public void onSuccess(java.lang.String deviceId) {
    setStatus(("Device Registered Successfully " + deviceId), true);
    push.listen(notificationListener);
}