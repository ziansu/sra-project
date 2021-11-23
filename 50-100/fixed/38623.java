@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL(com.example.mbodziony.datecounter.DatabaseManager.DB_CREATE_DATECOUNTERS_TABLE);
    android.util.Log.d(com.example.mbodziony.datecounter.DatabaseManager.DEBUG_TAG, "Database creating...");
    android.util.Log.d(com.example.mbodziony.datecounter.DatabaseManager.DEBUG_TAG, (((("Table " + (com.example.mbodziony.datecounter.DatabaseManager.DB_DATECOUNTERS_TABLE)) + " ver. ") + (com.example.mbodziony.datecounter.DatabaseManager.DB_VERSION)) + " was created!"));
}