public java.lang.Boolean addTournament(com.myapps.ekutarnia.trackmytourney.Tournament tourney) {
    java.lang.Boolean success = true;
    android.content.ContentValues val = new android.content.ContentValues();
    val.put(com.myapps.ekutarnia.trackmytourney.MyDBHandler.COLUMN_T_SDATE, tourney.getStartDate().toString());
    val.put(com.myapps.ekutarnia.trackmytourney.MyDBHandler.COLUMN_T_EDATE, tourney.getEndDate().toString());
    val.put(com.myapps.ekutarnia.trackmytourney.MyDBHandler.COLUMN_T_WINNER, tourney.getWinner());
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    db.insert(com.myapps.ekutarnia.trackmytourney.MyDBHandler.TABLE_TOURNAMENT, null, val);
    db.close();
    return success;
}