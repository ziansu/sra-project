public long addRecord(io.github.louistsaitszho.erg2.unit.Record r) {
    android.content.ContentValues cv = new android.content.ContentValues();
    cv.put(HistoryContract.HistoryEntry.COLUMN_NAME_DATETIME, r.startTimeToString());
    cv.put(HistoryContract.HistoryEntry.COLUMN_NAME_DISTANCE, r.getDistance());
    cv.put(HistoryContract.HistoryEntry.COLUMN_NAME_DURATION, r.getDuration());
    cv.put(HistoryContract.HistoryEntry.COLUMN_NAME_RATING, r.getRating());
    return db.insert(HistoryContract.HistoryEntry.TABLE_NAME, null, cv);
}