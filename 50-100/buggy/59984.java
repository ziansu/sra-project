public void insertPaymentMethods(java.lang.String name, int posAfterSort, int type) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    android.content.ContentValues contentValues = new android.content.ContentValues();
    contentValues.put(com.ab.piggybank.DatabaseHelper.COLUMN_PAYMENT_METHOD_NAME, name);
    contentValues.put(com.ab.piggybank.DatabaseHelper.COLUMN_METHOD_TYPE, type);
    contentValues.put(com.ab.piggybank.DatabaseHelper.COLUMN_METHOD_TYPE_AFTER_SORT, posAfterSort);
    contentValues.put(com.ab.piggybank.DatabaseHelper.COLUMN_METHOD_USABLE, 1);
    db.insert(com.ab.piggybank.DatabaseHelper.TABLENAME_3, null, contentValues);
}