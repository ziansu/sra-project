public void login(java.lang.String email) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    android.content.ContentValues contentValues = new android.content.ContentValues();
    contentValues.put(se.olz.myfootprints.DBUsers.COLUMN_NAME_LOGGEDIN, 1);
    db.update(se.olz.myfootprints.DBUsers.TABLE_NAME, contentValues, ((se.olz.myfootprints.DBUsers.COLUMN_NAME_EMAIL) + " = ?"), new java.lang.String[]{ email });
    isLoggedIn();
    db.close();
}