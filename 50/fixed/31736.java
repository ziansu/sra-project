@java.lang.Override
public void onCreate(final android.database.sqlite.SQLiteDatabase db) {
    db.execSQL((((((("CREATE TABLE IF NOT EXISTS " + (this.tableName)) + " (") + "id INTEGER PRIMARY KEY AUTOINCREMENT, ") + "name TEXT, ") + "done INTEGER") + ");"));
}