public android.database.Cursor getPuzzlesBySize(int c, int r) {
    android.database.sqlite.SQLiteDatabase db = this.getReadableDatabase();
    android.database.Cursor curs = db.rawQuery((((((("SELECT * FROM " + (com.example.jcdug.andnonogame.PuzzleDatabase.puzzleTable)) + " WHERE ") + (com.example.jcdug.andnonogame.PuzzleDatabase.col)) + " = ? AND ") + (com.example.jcdug.andnonogame.PuzzleDatabase.row)) + " = ?"), new java.lang.String[]{ java.lang.Integer.toString(c) , java.lang.Integer.toString(r) });
    return curs;
}