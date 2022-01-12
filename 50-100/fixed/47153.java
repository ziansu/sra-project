@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    if (oldVersion < 2) {
        db.execSQL((((("ALTER TABLE " + (com.lynxspa.androidadvanced201617.DBHelper.PROFILES_TABLE_NAME)) + " ADD COLUMN ") + (com.lynxspa.androidadvanced201617.DBHelper.PROFILES_COLUMN_LAT)) + " DOUBLE;"));
        db.execSQL((((("ALTER TABLE " + (com.lynxspa.androidadvanced201617.DBHelper.PROFILES_TABLE_NAME)) + " ADD COLUMN ") + (com.lynxspa.androidadvanced201617.DBHelper.PROFILES_COLUMN_LON)) + " DOUBLE;"));
    }
}