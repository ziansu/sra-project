@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL(com.example.android.inventoryapp.data.InventoryDbHelper.SQL_CREATE_ENTRIES);
    onCreate(db);
}