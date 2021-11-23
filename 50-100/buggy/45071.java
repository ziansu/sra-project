public com.firebirdberlin.tinytimetracker.LogEntry createLogEntry(long tracker_id, long timestamp_start, long timestamp_end) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(SQLiteHandler.COLUMN_TRACKER_ID, tracker_id);
    values.put(SQLiteHandler.COLUMN_TIMESTAMP_START, timestamp_start);
    values.put(SQLiteHandler.COLUMN_TIMESTAMP_END, timestamp_end);
    long insertId = database.insert(SQLiteHandler.TABLE_LOGS, null, values);
    return new com.firebirdberlin.tinytimetracker.LogEntry(insertId, tracker_id, timestamp_start, timestamp_end);
}