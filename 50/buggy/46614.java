public final void removeNotification(com.notification.Notification note) {
    m_notifications.remove(note);
    notificationRemoved(note);
    note.setNotificationManager(null);
}