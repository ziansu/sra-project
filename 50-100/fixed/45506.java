public void insertTeaches(com.a2pt.whatsnext.models.Teaches teaches, android.database.sqlite.SQLiteDatabase db) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(com.a2pt.whatsnext.services.ITSdbManager.KEY_TEACHES_SESSION_ID, teaches.getSessionID());
    values.put(com.a2pt.whatsnext.services.ITSdbManager.KEY_TEACHES_ID, teaches.getUserID());
    values.put(com.a2pt.whatsnext.services.ITSdbManager.KEY_TEACHES_MOD_ID, teaches.getModID());
    db.insert(com.a2pt.whatsnext.services.ITSdbManager.TABLE_TEACHES, null, values);
}