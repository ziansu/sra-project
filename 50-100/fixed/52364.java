@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL(("DROP TABLE IF EXISTS " + (com.expensetracker.db.DBHelper.ACCOUNT_TABLE_NAME)));
    db.execSQL(("DROP TABLE IF EXISTS " + (com.expensetracker.db.DBHelper.ICATEGORY_TABLE_NAME)));
    db.execSQL(("DROP TABLE IF EXISTS " + (com.expensetracker.db.DBHelper.ECATEGORY_TABLE_NAME)));
    db.execSQL(("DROP TABLE IF EXISTS " + (com.expensetracker.db.DBHelper.INCOME_TABLE_NAME)));
    onCreate(db);
}