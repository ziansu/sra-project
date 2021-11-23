@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    java.lang.String query = "CREATE TABLE todoList(_id INTEGER PRIMARY KEY AUTOINCREMENT," + " task TEXT)";
    db.execSQL(query);
}