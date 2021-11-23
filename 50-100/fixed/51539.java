int updateItem(com.example.android.codepathtodo.TodoItem item, java.lang.String text, java.lang.String date) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(com.example.android.codepathtodo.DatabaseHandler.KEY_TEXT, text);
    values.put(com.example.android.codepathtodo.DatabaseHandler.KEY_DATE, date);
    return db.update(com.example.android.codepathtodo.DatabaseHandler.TABLE_ITEMS, values, ((com.example.android.codepathtodo.DatabaseHandler.KEY_ID) + " = ?"), new java.lang.String[]{ java.lang.String.valueOf(item.getID()) });
}