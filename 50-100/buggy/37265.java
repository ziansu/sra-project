public long updateSubscribed(int eventID, boolean subscribed) {
    android.database.sqlite.SQLiteDatabase database = getWritableDatabase();
    android.content.ContentValues contentValues = new android.content.ContentValues();
    contentValues.put(com.example.jharshman.event.DataHelper.EVENT_COLUMN_SUBSCRIBED, (subscribed ? 1 : 0));
    long updated = database.update(com.example.jharshman.event.DataHelper.EVENT_TABLE, contentValues, ((com.example.jharshman.event.DataHelper.EVENT_COLUMN_ID) + "=?"), new java.lang.String[]{ java.lang.String.valueOf(eventID) });
    android.util.Log.i(com.example.jharshman.event.DataHelper.TAG, ("Event Subscription updated successful: " + updated));
    return updated;
}