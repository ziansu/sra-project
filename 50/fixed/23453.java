@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL(SQL_CREATE_CATEGORY_TABLE);
    db.execSQL(SQL_CREATE_INTERESTING_FACT_TABLE);
    db.execSQL(SQL_CREATE_ANSWER_TABLE);
    db.execSQL(SQL_CREATE_QUESTION_TABLE);
}