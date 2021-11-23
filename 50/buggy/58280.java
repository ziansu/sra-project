public com.sst.anouncements.DbAdapter open() throws android.database.SQLException {
    dbHelper = new com.sst.anouncements.DbAdapter.DbHelper(context);
    SQLdb = dbHelper.getWritableDatabase();
    return this;
}