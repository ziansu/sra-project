public long insertAuthor(android.database.sqlite.SQLiteDatabase db, java.lang.String firstName, java.lang.String lastName) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(Author.Columns.FIRST_NAME, firstName);
    values.put(Author.Columns.LAST_NAME, lastName);
    return db.insert(Author.TABLE_NAME, null, values);
}