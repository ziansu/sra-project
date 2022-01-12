public android.database.Cursor getPuzzlesBySize(int r, int c) {
    android.database.sqlite.SQLiteDatabase db = this.getReadableDatabase();
    android.database.Cursor curs = db.rawQuery((((((("SELECT * FROM " + (com.example.jcdug.andnonogame.PuzzleDatabase.puzzleTable)) + " WHERE ") + (com.example.jcdug.andnonogame.PuzzleDatabase.row)) + " = ? AND ") + (com.example.jcdug.andnonogame.PuzzleDatabase.col)) + " = ?"), new java.lang.String[]{ java.lang.Integer.toString(r) , java.lang.Integer.toString(c) });
    return curs;
}