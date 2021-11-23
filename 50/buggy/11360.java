public void stopAll() {
    for (java.util.Map.Entry<java.lang.String, org.md2k.notificationmanager.notification.Notification> entry : notificationHashMap.entrySet()) {
        entry.getValue().stop();
    }
}