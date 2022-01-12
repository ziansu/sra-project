public int updateDone(boolean done, long id) {
    android.content.ContentValues cv = new android.content.ContentValues();
    cv.put(Contract.TABLE_TODO.COLUMN_NAME_DONE, done);
    adapter.swapCursor(getAllItems(db));
    return db.update(Contract.TABLE_TODO.TABLE_NAME, cv, (((Contract.TABLE_TODO._ID) + "=") + id), null);
}