public void writeOrderTableRow(float count, java.lang.String description, java.lang.String orderID) {
    android.database.sqlite.SQLiteDatabase db = getReadableDatabase();
    android.content.ContentValues cv = new android.content.ContentValues();
    cv.put(ru.gembo.employee.SqlDataManager.ORDER_ROWS_COUNT, count);
    cv.put(ru.gembo.employee.SqlDataManager.ORDER_ROWS_DESCRIPTION, description);
    cv.put(ru.gembo.employee.SqlDataManager.ORDER_ROWS_ORDER, orderID);
    db.insert(ru.gembo.employee.SqlDataManager.ORDER_ROWS_TABLE, null, cv);
}