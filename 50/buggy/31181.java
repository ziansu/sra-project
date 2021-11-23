public void dismiss() {
    if (((notificationManager) != null) && ((notificationInfo) != null)) {
        notificationManager.cancel(notificationInfo.getNotificationId());
    }
}