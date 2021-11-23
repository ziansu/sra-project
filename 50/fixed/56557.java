@java.lang.Override
protected void tearDown() throws java.lang.Exception {
    mSolo.finishOpenedActivities();
    mAccountsDbAdapter.deleteAllRecords();
    mDbHelper.close();
    mDb.close();
    super.tearDown();
}