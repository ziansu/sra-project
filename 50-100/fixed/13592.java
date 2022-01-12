public android.database.Cursor getCountCompletedBySize() {
    android.database.sqlite.SQLiteDatabase db = this.getReadableDatabase();
    android.database.Cursor curs = db.rawQuery(((((((((((("SELECT " + (com.example.jcdug.andnonogame.PuzzleDatabase.col)) + ", ") + (com.example.jcdug.andnonogame.PuzzleDatabase.row)) + ", COUNT(*) AS numComplete FROM ") + (com.example.jcdug.andnonogame.PuzzleDatabase.puzzleTable)) + " WHERE ") + (com.example.jcdug.andnonogame.PuzzleDatabase.comp)) + " = ? GROUP BY ") + (com.example.jcdug.andnonogame.PuzzleDatabase.col)) + ", ") + (com.example.jcdug.andnonogame.PuzzleDatabase.row)), new java.lang.String[]{ java.lang.Integer.toString(1) });
    return curs;
}