public int updateProduct(android.content.ContentValues values, java.lang.String selection) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    int updatedRows = 0;
    updatedRows = db.update(com.duffin22.marketingapi.MyDBHandler.TABLE_SUPERSICKS, values, selection);
    db.close();
    return updatedRows;
}