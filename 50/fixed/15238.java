@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    updateMyDatabase(db, 1, com.enm.hch.HCHDatabaseHelper.DB_VERSION);
}