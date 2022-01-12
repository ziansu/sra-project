@java.lang.Override
public void run() {
    try {
        com.xizz.scoreoflife.util.Data.syncChecks();
        com.xizz.scoreoflife.util.Data.syncEvents();
    } catch (com.parse.ParseException e) {
        android.util.Log.e(TAG, ("Error synchronizing events: " + (e.getMessage())));
    }
    runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            loadEventCheckList();
            android.util.Log.d(TAG, "loaded event list after synchronization");
        }
    });
}