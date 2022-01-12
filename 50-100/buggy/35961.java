public boolean addBook(com.basic.androidnativeconcepts.model.Book book) {
    boolean flag = false;
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(com.basic.androidnativeconcepts.sqlite.SQLiteHelper.KEY_NAME, book.getBookName());
    values.put(com.basic.androidnativeconcepts.sqlite.SQLiteHelper.KEY_ID, book.getBookId());
    db.insert(com.basic.androidnativeconcepts.sqlite.SQLiteHelper.TABLE_CONTACTS, null, values);
    db.close();
    return flag;
}