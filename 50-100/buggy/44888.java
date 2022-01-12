public java.lang.String obtainUserPassword(final long theUserID) {
    android.database.Cursor currentRow = getReadableDatabase().rawQuery((((((("select * from " + (db.UserStorageDatabaseHelper.TABLE_USER)) + " where ") + (db.UserStorageDatabaseHelper.COLUMN_USER_ID)) + "='") + (java.lang.Long.toString(theUserID))) + "'"), null);
    java.lang.String userPassword = null;
    if (currentRow.moveToNext()) {
        userPassword = currentRow.getString(currentRow.getColumnIndex(db.UserStorageDatabaseHelper.COLUMN_PASSWORD));
    }
    currentRow.close();
    return userPassword;
}