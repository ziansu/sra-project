public void updatePaymentMethods(long id, java.lang.String name, int posAfterSort, int type) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    android.content.ContentValues contentValues = new android.content.ContentValues();
    contentValues.put(com.ab.piggybank.DatabaseHelper.COLUMN_PAYMENT_METHOD_NAME, name);
    contentValues.put(com.ab.piggybank.DatabaseHelper.COLUMN_METHOD_TYPE, type);
    contentValues.put(com.ab.piggybank.DatabaseHelper.COLUMN_METHOD_TYPE_AFTER_SORT, posAfterSort);
    db.update(com.ab.piggybank.DatabaseHelper.TABLENAME_3, contentValues, (((com.ab.piggybank.DatabaseHelper.COLUMN_ID) + " = ") + id), null);
}