public void addPost(android.internest.com.internest.Post post) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(android.internest.com.internest.MyDBHandler.POST_COLUMN_TITLE, java.lang.String.valueOf(post.getPtitle()));
    values.put(android.internest.com.internest.MyDBHandler.POST_COLUMN_BODY, java.lang.String.valueOf(post.getPbody()));
    values.put(android.internest.com.internest.MyDBHandler.POST_COLUMN_URL, java.lang.String.valueOf(post.getPurl()));
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    db.insert(android.internest.com.internest.MyDBHandler.TABLE_POST, null, values);
    db.close();
}