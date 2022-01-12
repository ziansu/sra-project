public android.database.sqlite.SQLiteDatabase deleteInvestments() {
    android.database.sqlite.SQLiteDatabase db = dbHelper.getWritableDatabase();
    db.execSQL(("DROP TABLE IF EXISTS " + (hu.uniobuda.nik.betherichest.Interfaces.DatabaseHandler.TABLE_INVESTMENTS)));
    db.execSQL(((((("CREATE TABLE " + (hu.uniobuda.nik.betherichest.Interfaces.DatabaseHandler.TABLE_INVESTMENTS)) + "(") + "_id   INTEGER PRIMARY KEY,") + "rank  INTEGER") + ")"));
    return db;
}