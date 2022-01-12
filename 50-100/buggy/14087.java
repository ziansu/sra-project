public android.database.Cursor getCountBySize() {
    android.database.sqlite.SQLiteDatabase db = this.getReadableDatabase();
    android.database.Cursor curs = db.rawQuery(((((((((("SELECT " + (com.example.jcdug.andnonogame.PuzzleDatabase.row)) + ", ") + (com.example.jcdug.andnonogame.PuzzleDatabase.col)) + ", COUNT(*) AS numPuzzles FROM ") + (com.example.jcdug.andnonogame.PuzzleDatabase.puzzleTable)) + " GROUP BY ") + (com.example.jcdug.andnonogame.PuzzleDatabase.row)) + ", ") + (com.example.jcdug.andnonogame.PuzzleDatabase.col)), new java.lang.String[]{  });
    return curs;
}