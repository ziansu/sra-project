public int getRunningSessionID() {
    db = dbHelper.getReadableDatabase();
    java.lang.String query = ((("SELECT * FROM " + (unipd.dei.ESP1415.falldetector.database.SessionDB.SessionTable.SESSION_TABLE)) + " WHERE ") + (unipd.dei.ESP1415.falldetector.database.SessionDB.SessionTable.ISRUNNING_COLUMN)) + " = 1";
    android.database.Cursor c = db.rawQuery(query, null);
    if (c.moveToFirst()) {
        return c.getInt(SessionTable.ID);
    }else
        return -1;
    
}