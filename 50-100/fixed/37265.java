public long updateSubscribed(int eventID, int subscribed) {
    android.database.sqlite.SQLiteDatabase database = getWritableDatabase();
    android.content.ContentValues contentValues = new android.content.ContentValues();
    contentValues.put(com.example.jharshman.event.DataHelper.EVENT_COLUMN_SUBSCRIBED, subscribed);
    long updated = database.update(com.example.jharshman.event.DataHelper.EVENT_TABLE, contentValues, ((com.example.jharshman.event.DataHelper.EVENT_COLUMN_ID) + "=?"), new java.lang.String[]{ java.lang.String.valueOf(eventID) });
    android.util.Log.i(com.example.jharshman.event.DataHelper.TAG, ("Event Subscription updated successful: " + updated));
    return updated;
}