public final void addNotification(com.notification.Notification note, com.utils.Time time) {
    if (!(m_notifications.contains(note))) {
        note.setNotificationManager(this);
        m_notifications.add(note);
        notificationAdded(note, time);
    }
}