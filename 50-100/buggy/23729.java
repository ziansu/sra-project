private java.util.List<ch.kalt.tschudin.eventreminder.business.Event> deleteOldEvents(java.util.List<ch.kalt.tschudin.eventreminder.business.Event> events) {
    for (ch.kalt.tschudin.eventreminder.business.Event event : events) {
        for (ch.kalt.tschudin.eventreminder.business.Reminder reminder : event.getReminders()) {
            if (((reminder.getDate().getTime()) + (ch.kalt.tschudin.eventreminder.server.context.ApplicationContext.getRetentionTime())) < (new java.util.Date().getTime())) {
                event.getReminders().remove(reminder);
            }
        }
    }
    return events;
}