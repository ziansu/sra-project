@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase datab) {
    db = datab;
    java.lang.String sql = ((((((((((((("CREATE TABLE IF NOT EXISTS " + (com.quizapp.zay.quizapp.DBHelper.TABLE_QUEST)) + " ( ") + (com.quizapp.zay.quizapp.DBHelper.ID)) + " INTEGER PRIMARY KEY AUTOINCREMENT, ") + (com.quizapp.zay.quizapp.DBHelper.QUESTION)) + " TEXT, ") + (com.quizapp.zay.quizapp.DBHelper.ANSWER)) + " TEXT, ") + (com.quizapp.zay.quizapp.DBHelper.OPTA)) + " TEXT, ") + (com.quizapp.zay.quizapp.DBHelper.OPTB)) + " TEXT, ") + (com.quizapp.zay.quizapp.DBHelper.OPTC)) + " TEXT)";
    db.execSQL(sql);
    addQuestions();
}