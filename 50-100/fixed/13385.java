public void AddActivityList(java.lang.String TableNmae) {
    android.database.sqlite.SQLiteDatabase ourDatabase = this.getWritableDatabase();
    java.lang.String KEY_ROWID = "AID";
    java.lang.String KEY_2TBL = "ACTIVITY";
    java.lang.String KEY_ONE = "TYPE";
    ourDatabase.execSQL(((((((((((("CREATE TABLE IF NOT EXISTS '" + TableNmae) + "' (") + KEY_ROWID) + " INTEGER PRIMARY KEY AUTOINCREMENT, ") + KEY_2TBL) + " TEXT NOT NULL, ") + KEY_ONE) + " TEXT NOT NULL, ") + "UNIQUE(") + KEY_2TBL) + "));"));
}