public int increaseQty(int quantity, int increase, java.lang.String name) {
    quantity = quantity + increase;
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(Contract.Products.QTY, quantity);
    java.lang.String where = "product_name =?";
    java.lang.String[] whereArgs = new java.lang.String[]{ name };
    db.update(Contract.Products.TABLE_NAME, values, where, whereArgs);
    notifyObservers();
    return quantity;
}