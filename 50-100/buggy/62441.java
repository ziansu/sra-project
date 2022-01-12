public void createUser(io.github.data4all.model.data.User user) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(io.github.data4all.model.DataBaseHandler.KEY_USERNAME, user.getUsername());
    values.put(io.github.data4all.model.DataBaseHandler.KEY_TOKEN, user.getOAuthToken());
    values.put(io.github.data4all.model.DataBaseHandler.KEY_TOKENSECRET, user.getOauthTokenSecret());
    db.insert(io.github.data4all.model.DataBaseHandler.TABLE_USER, null, values);
    db.close();
}