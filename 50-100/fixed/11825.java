public void addOrderRecord(int orderId, double total) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(com.samdevlin.restbite.database.ClientDatabase.COLUMN_ORDER_ID, orderId);
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    db.insert(com.samdevlin.restbite.database.ClientDatabase.TABLE_ORDERRECORD, null, values);
    db.close();
}