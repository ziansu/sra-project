@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    java.lang.String CREATE_CONTACTS_TABLE = (((((("CREATE TABLE " + (com.example.ajstrand.reminderapp.DBHandler.TABLE_NAME)) + "(") + (com.example.ajstrand.reminderapp.DBHandler.KEY_ID)) + " INTEGER PRIMARY_KEY, ") + (com.example.ajstrand.reminderapp.DBHandler.KEY_NAME)) + " TEXT") + ")";
    db.execSQL(CREATE_CONTACTS_TABLE);
}