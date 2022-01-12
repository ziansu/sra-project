public void deleteGoals() {
    android.database.sqlite.SQLiteDatabase myDb = this.getWritableDatabase();
    android.database.Cursor res = myDb.rawQuery("SELECT * FROM GOALS", null);
    res.moveToFirst();
    while (!(res.isAfterLast())) {
        myDb.execSQL(("DROP TABLE " + (getGoalTableName(res.getString(res.getColumnIndex("name"))))));
        res.moveToNext();
    } 
    myDb.execSQL("DROP TABLE GOALS");
}