public void setNotificationsEnabled(boolean enabled) {
    if (enabled == (notificationInfo.getShowNotifications())) {
        return ;
    }
    notificationInfo.setShowNotifications(enabled);
    if (!enabled) {
        notificationManager.cancel(notificationInfo.getNotificationId());
    }
}