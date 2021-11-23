public void addEntry(com.example.lenni.blackjack_ptm.LeaderboardEntry entry) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(com.example.lenni.blackjack_ptm.LeaderBoardDbHelper.COLUMN_PLAYER, entry.getPlayerName());
    values.put(com.example.lenni.blackjack_ptm.LeaderBoardDbHelper.COLUMN_SCORE, entry.getScore());
    db.replace(com.example.lenni.blackjack_ptm.LeaderBoardDbHelper.TABLE_LEADERBOARD, null, values);
    db.close();
}