public void checkGoalTableIsDefined() {
    android.database.sqlite.SQLiteDatabase myDb = this.getWritableDatabase();
    myDb.execSQL(("CREATE TABLE IF NOT EXISTS GOALS " + "(id integer primary key, name text, goal integer, deposited integer)"));
}