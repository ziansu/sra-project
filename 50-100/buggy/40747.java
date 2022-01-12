public int getBasketCount() {
    java.lang.String countQuery = "SELECT  * FROM " + (sdi.com.currencywizard.database.DatabaseHandler.TABLE_BASKET_LIST);
    android.database.sqlite.SQLiteDatabase db = this.getReadableDatabase();
    android.database.Cursor cursor = db.rawQuery(countQuery, null);
    int cnt = cursor.getCount();
    cursor.close();
    return cnt;
}