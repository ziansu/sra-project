@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL(com.example.mbodziony.datecounter.DatabaseManager.DB_DROP_DATECOUNTERS_TABLE);
    android.widget.Toast.makeText(context, "updating TABLE", Toast.LENGTH_SHORT).show();
    android.util.Log.d(com.example.mbodziony.datecounter.DatabaseManager.DEBUG_TAG, "Database updating...");
    android.util.Log.d(com.example.mbodziony.datecounter.DatabaseManager.DEBUG_TAG, ((((("Table " + (com.example.mbodziony.datecounter.DatabaseManager.DB_DATECOUNTERS_TABLE)) + " updated from ver. ") + oldVersion) + " to ver. ") + newVersion));
    android.util.Log.d(com.example.mbodziony.datecounter.DatabaseManager.DEBUG_TAG, "All data is lost!");
    onCreate(db);
}