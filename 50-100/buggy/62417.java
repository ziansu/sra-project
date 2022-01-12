public boolean checkGoalExists(java.lang.String name) {
    android.database.sqlite.SQLiteDatabase myDb = this.getWritableDatabase();
    android.database.Cursor res = myDb.rawQuery((("SELECT * FROM GOALS WHERE NAME='" + name) + "'"), null);
    if ((res.getCount()) > 0) {
        myDb.close();
        return true;
    }else {
        myDb.close();
        return false;
    }
}