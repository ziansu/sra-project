@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    android.util.Log.i(com.nineinchmales.longcircuit.database.DBHelper.LOG_TAG, "Creating tables");
    createTables(db);
}