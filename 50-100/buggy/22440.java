public int getRunningSessionID() {
    db = dbHelper.getReadableDatabase();
    android.database.Cursor c = db.rawQuery((((("SELECT * FROM " + (unipd.dei.ESP1415.falldetector.database.SessionDB.SessionTable.SESSION_TABLE)) + " WHERE ") + (unipd.dei.ESP1415.falldetector.database.SessionDB.SessionTable.ISRUNNING_COLUMN)) + " = 1"), null);
    if (c.moveToFirst()) {
        return c.getInt(SessionTable.ID);
    }
    return -1;
}