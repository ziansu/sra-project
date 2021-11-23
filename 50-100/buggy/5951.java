public void recordServiceStart() {
    android.util.Log.i(com.prismaqf.callblocker.CallHelper.TAG, "Opening a DB connection and recording service start");
    android.database.sqlite.SQLiteDatabase db = new com.prismaqf.callblocker.sql.DbHelper(ctx).getWritableDatabase();
    com.prismaqf.callblocker.sql.ServiceRun lastRun = com.prismaqf.callblocker.sql.ServiceRun.LatestRun(db);
    setNumReceived(lastRun.getNumReceived());
    setNumTriggered(lastRun.getNumTriggered());
    myRunId = com.prismaqf.callblocker.sql.ServiceRun.InsertAtServiceStart(db);
    com.prismaqf.callblocker.sql.ServiceRun.UpdateWhileRunning(db, myRunId, (-1), (-1));
    db.close();
}