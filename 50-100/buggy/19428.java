public android.database.Cursor getMatchesList(java.lang.String username) {
    java.lang.String data = "";
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    java.lang.String[] queryCols = new java.lang.String[]{ "matchID" , "player1" , "player2" };
    android.database.Cursor cursor = db.query(com.example.kk.fydipkk1.MyDBHandler.TABLE_MATCH, queryCols, (((com.example.kk.fydipkk1.MyDBHandler.COLUMN_USER) + " = ") + username), null, null, null, null);
    return cursor;
}