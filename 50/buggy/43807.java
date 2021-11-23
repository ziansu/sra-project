public void setPushEnabled(java.lang.Boolean pushEnabled) {
    if (pushEnabled) {
        registerForNotifications(defaultCallback);
    }else {
        unregisterForNotifications(defaultCallback);
    }
}