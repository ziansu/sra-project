@java.lang.Override
public void run() {
    android.util.Log.i(com.prismaqf.callblocker.CallHelper.TAG, "Recording a call received in DB");
    android.database.sqlite.SQLiteDatabase db = new com.prismaqf.callblocker.sql.DbHelper(ctx).getWritableDatabase();
    try {
        com.prismaqf.callblocker.sql.ServiceRun lastRun = com.prismaqf.callblocker.sql.ServiceRun.LatestRun(db);
        java.lang.String contactDescription = resolveContactDescription(incomingNumber);
        com.prismaqf.callblocker.sql.LoggedCall.InsertRow(db, lastRun.getId(), incomingNumber, contactDescription, null);
        com.prismaqf.callblocker.sql.ServiceRun.UpdateWhileRunning(db, myRunId, ((numReceived) + 1), numTriggered);
    } finally {
        db.close();
    }
}