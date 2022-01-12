public final void removeNotification(com.notification.Notification note) {
    if (m_notifications.contains(note)) {
        m_notifications.remove(note);
        notificationRemoved(note);
        note.setNotificationManager(null);
    }
}