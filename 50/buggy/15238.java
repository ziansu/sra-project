@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    updateMyDatabase(db, 0, com.enm.hch.HCHDatabaseHelper.DB_VERSION);
}