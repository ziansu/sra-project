private void addNotification(android.content.ContentResolver cr, long eventID, int min) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(CalendarContract.Reminders.MINUTES, min);
    values.put(CalendarContract.Reminders.EVENT_ID, eventID);
    values.put(CalendarContract.Reminders.METHOD, CalendarContract.Reminders.METHOD_ALERT);
    cr.insert(CalendarContract.Reminders.CONTENT_URI, values);
}