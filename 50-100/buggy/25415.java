@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    java.lang.String CREATE_PEOPLE_TABLE = (((((((("CREATE TABLE IF NOT EXISTS " + (com.bk.fm.findmeeting.DataBase.TABLE_PEOPLE)) + "(") + (com.bk.fm.findmeeting.DataBase.PRIMARY_KEY)) + " INTEGER PRIMARY KEY AUTOINCREMENT,") + (com.bk.fm.findmeeting.DataBase.NAME_KEY)) + " TEXT NOT NULL,") + (com.bk.fm.findmeeting.DataBase.AVAIL_KEY)) + " TEXT NOT NULL") + ")";
    db.execSQL(CREATE_PEOPLE_TABLE);
}