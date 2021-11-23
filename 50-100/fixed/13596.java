public int updateUser(io.github.data4all.model.data.User user) {
    final android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    final android.content.ContentValues values = new android.content.ContentValues();
    values.put(io.github.data4all.model.DataBaseHandler.KEY_USERNAME, user.getUsername());
    values.put(io.github.data4all.model.DataBaseHandler.KEY_TOKEN, user.getOAuthToken());
    values.put(io.github.data4all.model.DataBaseHandler.KEY_TOKENSECRET, user.getOauthTokenSecret());
    return db.update(io.github.data4all.model.DataBaseHandler.TABLE_USER, values, ((io.github.data4all.model.DataBaseHandler.KEY_USERNAME) + "=?"), new java.lang.String[]{ user.getUsername() });
}