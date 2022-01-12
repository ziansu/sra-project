public boolean userLocked(javathehutt.buzz_movieselector.model.User u) {
    javathehutt.buzz_movieselector.model.DatabaseHelper.db = this.getReadableDatabase();
    java.lang.String query = ((("select * from " + (javathehutt.buzz_movieselector.model.DatabaseHelper.TABLE_NAME)) + " where username like \'") + (u.getUsername())) + "\'";
    android.database.Cursor cursor = javathehutt.buzz_movieselector.model.DatabaseHelper.db.rawQuery(query, null);
    if (cursor.moveToFirst()) {
        return (cursor.getInt(6)) >= 3;
    }
    return false;
}