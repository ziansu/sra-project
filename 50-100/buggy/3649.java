public boolean insertPurchase(java.lang.String name, float amount) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    android.content.ContentValues vals = new android.content.ContentValues();
    vals.put(DatabaseContract.PurchaseEntry.COLUMN_NAME, name);
    vals.put(DatabaseContract.PurchaseEntry.COLUMN_AMOUNT, amount);
    db.insert(DatabaseContract.PurchaseEntry.TABLE_NAME, null, vals);
    return true;
}