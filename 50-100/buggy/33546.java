void addUser(java.lang.String username, java.lang.String password, int level) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(com.example.paulk.MusicTutorApp.DatabaseHandler.KEY_USERNAME, username);
    values.put(com.example.paulk.MusicTutorApp.DatabaseHandler.KEY_PASSWORD, password);
    values.put(com.example.paulk.MusicTutorApp.DatabaseHandler.KEY_USERLEVELID, level);
    db.insert(com.example.paulk.MusicTutorApp.DatabaseHandler.TABLE_USER, null, values);
    db.close();
}