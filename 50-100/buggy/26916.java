public int Edit(com.gravity.innovations.tasks.done.UserModel user) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    android.content.ContentValues values = setContent(user);
    int i = db.update(com.gravity.innovations.tasks.done.DatabaseHelper.TABLE_USERS, values, ((com.gravity.innovations.tasks.done.DatabaseHelper.KEY_PK) + " = ?"), new java.lang.String[]{ java.lang.String.valueOf(user._id) });
    db.close();
    return i;
}