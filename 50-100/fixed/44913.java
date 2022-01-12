public int getCount() {
    com.sean.takeastand.storage.StoodLogsAdapter.StoodSQLHelper stoodSQLHelper = new com.sean.takeastand.storage.StoodLogsAdapter.StoodSQLHelper(mContext);
    java.lang.String[] columns = new java.lang.String[]{ com.sean.takeastand.storage.StoodLogsAdapter.StoodSQLHelper.UID };
    android.database.Cursor cursor = stoodSQLHelper.getReadableDatabase().query(com.sean.takeastand.storage.StoodLogsAdapter.StoodSQLHelper.TABLE_MAIN, columns, null, null, null, null, null);
    int count = cursor.getCount();
    cursor.close();
    stoodSQLHelper.close();
    return count;
}