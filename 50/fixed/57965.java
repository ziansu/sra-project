@java.lang.Override
public void changeTrackerCaughtUp() {
    com.couchbase.lite.util.Log.d(Log.TAG_SYNC, "changeTrackerCaughtUp");
    waitForPendingFuturesWithNewThread();
}