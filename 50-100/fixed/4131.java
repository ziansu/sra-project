public long addUser(com.begentgroup.miniproject.data.User user) {
    if ((getUserId(user.getId())) == (-1)) {
        android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
        values.clear();
        values.put(ChatContract.ChatUser.COLUMN_SERVER_ID, user.getId());
        values.put(ChatContract.ChatUser.COLUMN_NAME, user.getUserName());
        values.put(ChatContract.ChatUser.COLUMN_EMAIL, user.getEmail());
        return db.insert(ChatContract.ChatUser.TABLE, null, values);
    }
    throw new java.lang.IllegalArgumentException("aleady user added");
}