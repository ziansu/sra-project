public com.codequest.utils.User insertUser(com.codequest.utils.User queryValues) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    android.content.ContentValues values = new android.content.ContentValues();
    values.put("login", queryValues.login);
    values.put("password", queryValues.password);
    queryValues.userId = db.insert("userdata", null, values);
    db.close();
    return queryValues;
}