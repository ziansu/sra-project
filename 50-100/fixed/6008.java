public boolean userExist(int id) {
    android.database.sqlite.SQLiteDatabase db = this.getReadableDatabase();
    android.database.Cursor res = db.rawQuery((("select * from users where id = '" + id) + "'"), null);
    if ((res.getCount()) > 0)
        return true;
    
    return false;
}