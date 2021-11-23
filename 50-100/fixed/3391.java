public void addFriend(example.codeclan.com.friendshiptracker.Friend friend) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(example.codeclan.com.friendshiptracker.DBHandler.KEY_FIRST_NAME, friend.getFirstName());
    values.put(example.codeclan.com.friendshiptracker.DBHandler.KEY_LAST_NAME, friend.getLastName());
    values.put(example.codeclan.com.friendshiptracker.DBHandler.KEY_TOTAL_DAYS, friend.getTotalDays());
    values.put(example.codeclan.com.friendshiptracker.DBHandler.KEY_DATE_SET, friend.getDateSet());
    db.insert(example.codeclan.com.friendshiptracker.DBHandler.TABLE_FRIENDS, null, values);
    db.close();
}