public int getLowestScore(android.database.sqlite.SQLiteDatabase db) {
    android.database.Cursor c = db.query(TimelineTables.HighScore.TABLE_NAME, new java.lang.String[]{ ("min(" + (TimelineTables.HighScore.COL_SCORE)) + ")" }, null, null, null, null, null);
    c.moveToFirst();
    int lowestScore = c.getInt(0);
    return lowestScore;
}