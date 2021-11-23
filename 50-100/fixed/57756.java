public int getCalendarColor(android.content.ContentResolver cr, java.lang.String calName, long id) {
    android.database.Cursor c = getCalendarCursor(cr);
    while (c.moveToNext()) {
        if (calName.equals(c.getString(CalendarUtils.CALENDAR_NAME))) {
            return c.getInt(CalendarUtils.CALENDAR_COLOR);
        }
    } 
    return 0;
}