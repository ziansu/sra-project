private void stopNotificationService() {
    try {
        stopService(notificationsAlertIntent);
    } catch (java.lang.Exception ignored) {
    }
}