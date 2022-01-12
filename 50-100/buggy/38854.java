public void addUser(com.cse5236.meet_up.classes.User user) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(com.cse5236.meet_up.classes.database.DatabaseHandler.KEY_NAME, user.getName());
    values.put(com.cse5236.meet_up.classes.database.DatabaseHandler.KEY_EMAIL, user.getEmail());
    values.put(com.cse5236.meet_up.classes.database.DatabaseHandler.KEY_PASSWORD, user.getPassword());
    db.insert(com.cse5236.meet_up.classes.database.DatabaseHandler.TABLE_USERS, null, values);
    db.close();
}