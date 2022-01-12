public android.database.Cursor getCountCompletedBySize() {
    android.database.sqlite.SQLiteDatabase db = this.getReadableDatabase();
    android.database.Cursor curs = db.rawQuery(((((((((((("SELECT " + (com.example.jcdug.andnonogame.PuzzleDatabase.row)) + ", ") + (com.example.jcdug.andnonogame.PuzzleDatabase.col)) + ", COUNT(*) AS numComplete FROM ") + (com.example.jcdug.andnonogame.PuzzleDatabase.puzzleTable)) + " WHERE ") + (com.example.jcdug.andnonogame.PuzzleDatabase.comp)) + " = ? GROUP BY ") + (com.example.jcdug.andnonogame.PuzzleDatabase.row)) + ", ") + (com.example.jcdug.andnonogame.PuzzleDatabase.col)), new java.lang.String[]{ java.lang.Integer.toString(1) });
    return curs;
}