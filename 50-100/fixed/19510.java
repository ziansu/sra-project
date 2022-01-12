public static android.content.ContentProviderOperation insert(android.content.Context context, com.kunzisoft.remembirthday.element.Reminder reminder, int backref) {
    android.content.ContentProviderOperation.Builder builder = android.content.ContentProviderOperation.newInsert(com.kunzisoft.remembirthday.provider.CalendarProvider.getBirthdayAdapterUri(context, CalendarContract.Reminders.CONTENT_URI));
    builder.withValueBackReference(CalendarContract.Reminders.EVENT_ID, backref);
    builder.withValue(CalendarContract.Reminders.MINUTES, reminder.getMinutesBeforeEvent());
    builder.withValue(CalendarContract.Reminders.METHOD, CalendarContract.Reminders.METHOD_ALERT);
    return builder.build();
}