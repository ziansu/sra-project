@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    java.lang.String CREATE_CONTACTS_TABLE = (((((((((((((("CREATE TABLE " + (frozventus.ticklist.DBHandler.TASK_TABLE_NAME)) + "(") + (frozventus.ticklist.DBHandler.TASK_COLUMN_ID)) + " INTEGER PRIMARY KEY AUTOINCREMENT, ") + (frozventus.ticklist.DBHandler.TASK_COLUMN_TITLE)) + " TEXT, ") + (frozventus.ticklist.DBHandler.TASK_COLUMN_DETAILS)) + " TEXT, ") + (frozventus.ticklist.DBHandler.TASK_COLUMN_DATE)) + " TEXT, ") + (frozventus.ticklist.DBHandler.TASK_COLUMN_DAILY)) + " TEXT, ") + (frozventus.ticklist.DBHandler.TASK_COLUMN_LASTCOMPLETED)) + " TEXT") + ")";
    db.execSQL(CREATE_CONTACTS_TABLE);
}