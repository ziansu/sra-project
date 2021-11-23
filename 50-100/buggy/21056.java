public int getAmountofDeck() {
    java.lang.String query = (("SELECT " + (com.example.giang.tablayoutproject.DatabaseHelper.KEY_ID)) + " FROM ") + (com.example.giang.tablayoutproject.DatabaseHelper.TABLE_DECK);
    android.database.sqlite.SQLiteDatabase db = this.getReadableDatabase();
    android.database.Cursor c = db.rawQuery(query, null);
    c.close();
    return c.getCount();
}