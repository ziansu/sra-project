@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    if (oldVersion != newVersion) {
        db.execSQL(("DROP TABLE IF EXISTS " + (com.cherednichenko.antonina.detoxdiet.db.ProgramsDatabaseHelper.TABLE_PROGRAMS)));
        db.execSQL(("DROP TABLE IF EXISTS " + (com.cherednichenko.antonina.detoxdiet.db.ProgramsDatabaseHelper.TABLE_DAYS)));
        onCreate(db);
    }
}