public int updateItem(com.example.android.codepathtodo.TodoItem item) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(com.example.android.codepathtodo.DatabaseHandler.KEY_TEXT, item.getItemText());
    values.put(com.example.android.codepathtodo.DatabaseHandler.KEY_DATE, item.getItemDate());
    return db.update(com.example.android.codepathtodo.DatabaseHandler.TABLE_ITEMS, values, ((com.example.android.codepathtodo.DatabaseHandler.KEY_ID) + " = ?"), new java.lang.String[]{ java.lang.String.valueOf(item.getID()) });
}