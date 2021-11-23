public int getCardsAmountBaseOnDeckID(long deckid) {
    java.lang.String query = (((("SELECT * FROM " + (com.example.giang.tablayoutproject.DatabaseHelper.TABLE_CARD)) + " WHERE ") + (com.example.giang.tablayoutproject.DatabaseHelper.KEY_DECK_ID)) + " = ") + deckid;
    android.database.sqlite.SQLiteDatabase db = this.getReadableDatabase();
    android.database.Cursor c = db.rawQuery(query, null);
    int count = c.getCount();
    c.close();
    return count;
}