public android.database.Cursor getCountBySize() {
    android.database.sqlite.SQLiteDatabase db = this.getReadableDatabase();
    android.database.Cursor curs = db.rawQuery(((((((((("SELECT " + (com.example.jcdug.andnonogame.PuzzleDatabase.col)) + ", ") + (com.example.jcdug.andnonogame.PuzzleDatabase.row)) + ", COUNT(*) AS numPuzzles FROM ") + (com.example.jcdug.andnonogame.PuzzleDatabase.puzzleTable)) + " GROUP BY ") + (com.example.jcdug.andnonogame.PuzzleDatabase.col)) + ", ") + (com.example.jcdug.andnonogame.PuzzleDatabase.row)), new java.lang.String[]{  });
    return curs;
}