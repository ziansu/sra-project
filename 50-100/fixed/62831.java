public void searchKeyString(java.lang.String key) {
    java.lang.String selectQuery = ((("SELECT  * FROM " + (DBHelper.TABLE_NAME)) + " WHERE ") + (DBHelper.COLUMN_NAME)) + " LIKE ?";
    android.database.sqlite.SQLiteDatabase dbRead = com.ateet.excel.MainActivity.db.getReadableDatabase();
    com.ateet.excel.MainActivity.mCursor = dbRead.rawQuery(selectQuery, new java.lang.String[]{ ("%" + key) + "%" });
    if (com.ateet.excel.MainActivity.mCursor.moveToFirst()) {
        com.ateet.excel.MainActivity.mContactAdapter.changeCursor(com.ateet.excel.MainActivity.mCursor);
    }else {
        com.ateet.excel.MainActivity.mContactAdapter.changeCursor(null);
        empty.setText("No Results Found");
    }
}