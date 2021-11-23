@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase sqLiteDatabase) {
    try {
        sqLiteDatabase.beginTransaction();
        sqLiteDatabase.execSQL(Contract.CategoryEntry.SQL_CREATE_ENTRIE);
        sqLiteDatabase.execSQL(Contract.PharmacyEntry.SQL_CREATE_ENTRIE);
        sqLiteDatabase.execSQL(Contract.InvoiceStatusEntry.SQL_CREATE_ENTRIE);
        sqLiteDatabase.execSQL(Contract.ProductEntry.SQL_CREATE_ENTRIE);
        sqLiteDatabase.execSQL(Contract.InvoiceEntry.SQL_CREATE_ENTRIE);
        sqLiteDatabase.execSQL(Contract.InvoiceLineEntry.SQL_CREATE_ENTRIE);
        insertData(sqLiteDatabase);
        sqLiteDatabase.setTransactionSuccessful();
    } catch (android.database.sqlite.SQLiteException ex) {
        android.util.Log.e("DATABASE ERROR", ex.getLocalizedMessage());
    } finally {
        sqLiteDatabase.endTransaction();
    }
}