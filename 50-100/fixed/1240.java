@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL((((((((((("create table " + (com.example.rishabh.friday.MyDBHandler.TABLE_NAME)) + "(") + (com.example.rishabh.friday.MyDBHandler.COLUMN_ID)) + " integer primary key autoincrement, ") + (com.example.rishabh.friday.MyDBHandler.COLUMN_TYPE)) + " text, ") + (com.example.rishabh.friday.MyDBHandler.COLUMN_DESCRIPTION)) + " text, ") + (com.example.rishabh.friday.MyDBHandler.COLUMN_LABEL)) + " text);"));
}