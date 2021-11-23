@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int i, int i1) {
    android.widget.Toast.makeText(context, "DB Upgraded", Toast.LENGTH_SHORT).show();
    db.execSQL(("DROP TABLE " + (com.example.evelina.befit.model.DbManager.USERS_TABLE)));
    db.execSQL(("DROP TABLE " + (com.example.evelina.befit.model.DbManager.CHALLENGES_TABLE)));
    db.execSQL(("DROP TABLE " + (com.example.evelina.befit.model.DbManager.EXERCISE_TABLE)));
    db.execSQL(("DROP TABLE " + (com.example.evelina.befit.model.DbManager.ALARM_TABLE)));
    onCreate(db);
}