public void dismiss() {
    if ((notificationManager) != null) {
        notificationManager.cancel(notificationInfo.getNotificationId());
    }
}