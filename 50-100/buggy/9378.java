@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    java.lang.String CREATE_WIFIS_TABLE = (((((((((((("CREATE TABLE " + (com.example.iit2014094.autotaskerapp.DatabaseHandler.TABLE_WIFIS)) + "(") + (com.example.iit2014094.autotaskerapp.DatabaseHandler.KEY_ID)) + " INTEGER PRIMARY KEY,") + (com.example.iit2014094.autotaskerapp.DatabaseHandler.KEY_NAME)) + " TEXT,") + (com.example.iit2014094.autotaskerapp.DatabaseHandler.KEY_BSSID_NO)) + " TEXT") + (com.example.iit2014094.autotaskerapp.DatabaseHandler.KEY_SILENCE)) + " TEXT,") + (com.example.iit2014094.autotaskerapp.DatabaseHandler.KEY_AUTO_SMS)) + " TEXT,") + ")";
    db.execSQL(CREATE_WIFIS_TABLE);
}