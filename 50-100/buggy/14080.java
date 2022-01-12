public long obtainUserID(final java.lang.String theEmail) {
    android.database.Cursor currentRow = getReadableDatabase().rawQuery((((((("select * from " + (db.UserStorageDatabaseHelper.TABLE_USER)) + " where ") + (db.UserStorageDatabaseHelper.COLUMN_EMAIL_ADDRESS)) + "='") + theEmail) + "'"), null);
    long userID = 0;
    if (currentRow.moveToNext()) {
        userID = currentRow.getLong(currentRow.getColumnIndex(db.UserStorageDatabaseHelper.COLUMN_USER_ID));
    }
    currentRow.close();
    return userID;
}