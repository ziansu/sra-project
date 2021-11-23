public static void reScheduleAllReminders(android.content.Context context) {
    final com.github.trainjezelf.datastore.DataStore dataStore = com.github.trainjezelf.datastore.DataStore.getInstance(context);
    for (com.github.trainjezelf.datastore.Reminder reminder : dataStore.getReminders()) {
        final int uniqueId = reminder.getUniqueId();
        com.github.trainjezelf.alarm.AlarmScheduler.scheduleNextReminder(context, uniqueId);
    }
}