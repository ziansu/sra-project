private void deleteOldEvents() {
    for (ch.kalt.tschudin.eventreminder.business.Event event : events) {
        for (ch.kalt.tschudin.eventreminder.business.Reminder reminder : event.getReminders()) {
            if (((reminder.getDate().getTime()) + (ch.kalt.tschudin.eventreminder.server.context.ApplicationContext.getRetentionTime())) < (new java.util.Date().getTime())) {
            }
        }
    }
}