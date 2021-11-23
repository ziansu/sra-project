@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    if ((uk.ac.abertay.firedroidpager.SQLDatabaseHelper.DBVER) > 1) {
        db.execSQL(("DROP IF TABLE EXISTS " + (uk.ac.abertay.firedroidpager.SQLDatabaseHelper.TABLE_NAME)));
    }
}