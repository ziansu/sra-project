public java.util.List<com.nicdsmith.test.gamenight.Event> getAllEvents() {
    java.util.List<com.nicdsmith.test.gamenight.Event> events = new java.util.ArrayList<com.nicdsmith.test.gamenight.Event>();
    android.database.Cursor cursor = com.nicdsmith.test.gamenight.EventDataSource.database.query(SQLiteHelper.TABLE_NAME, allColumns, null, null, null, null, null);
    cursor.moveToFirst();
    while (!(cursor.isAfterLast())) {
        com.nicdsmith.test.gamenight.Event event = cursorToEvent(cursor);
        events.add(event);
        cursor.moveToNext();
    } 
    cursor.close();
    return events;
}