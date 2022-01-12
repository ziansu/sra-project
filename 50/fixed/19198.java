@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) throws com.tonilopezmr.easysqlite.exception.SQLiteHelperException {
    for (java.lang.String table : tables) {
        db.execSQL(table);
    }
}