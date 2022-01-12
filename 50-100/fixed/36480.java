public void CreateExercise(int preid, java.lang.String desc, int duration, java.lang.String date) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(team5.diabetesself_managmentapp.DatabaseHelper.EXER_PRES, preid);
    values.put(team5.diabetesself_managmentapp.DatabaseHelper.EXER_DESC, desc);
    values.put(team5.diabetesself_managmentapp.DatabaseHelper.EXER_DURATION, duration);
    values.put(team5.diabetesself_managmentapp.DatabaseHelper.EXER_DATETIME, date);
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    db.insert(team5.diabetesself_managmentapp.DatabaseHelper.TABLE_EXERCISE, null, values);
    db.close();
}