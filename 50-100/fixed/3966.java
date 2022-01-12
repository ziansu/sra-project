public java.lang.Long getOrCreateAnswerId(java.lang.String answer, long categoryId) {
    long answerId = getEntityId(ProductContract.Answer.TABLE_NAME, ProductContract.Answer.COLUMN_CONTENT, answer);
    if (answerId < 0) {
        android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
        android.content.ContentValues values = new android.content.ContentValues();
        values.put(ProductContract.Answer.COLUMN_CONTENT, answer);
        values.put(ProductContract.Answer.COLUMN_CATEGORY_KEY, categoryId);
        answerId = db.insert(ProductContract.Answer.TABLE_NAME, null, values);
    }
    return answerId;
}