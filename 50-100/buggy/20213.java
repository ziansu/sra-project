public void task(android.database.sqlite.SQLiteDatabase db) {
    android.database.Cursor c = dbh.goals.query(null, null, null, GoalContract.DUE_DATE, true, null, db);
    c.moveToFirst();
    while (((c.getCount()) > 0) && (!(c.isAfterLast()))) {
        goals.add(dbh.goals.build(c));
        c.moveToNext();
    } 
}