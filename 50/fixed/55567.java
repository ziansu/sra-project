public void deleteUser(io.github.data4all.model.data.User user) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    db.delete(io.github.data4all.model.DataBaseHandler.TABLE_USER, ((io.github.data4all.model.DataBaseHandler.KEY_USERNAME) + "=?"), new java.lang.String[]{ user.getUsername() });
}