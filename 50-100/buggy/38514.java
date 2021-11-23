public synchronized int getNextNumberOfNotifications(int uniqueId) {
    final com.github.trainjezelf.datastore.Reminder reminder = reminders.get(uniqueId);
    if (reminder == null) {
        return 0;
    }
    final int result = reminder.getNumberOfNotifications();
    reminder.setNumberOfNotifications((result + 1));
    saveReminders();
    return result;
}