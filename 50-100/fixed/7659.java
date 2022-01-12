@java.lang.Override
public void run() {
    while (threadRun) {
        if (!(queue.isEmpty())) {
            try {
                storeTripMessage(queue.take());
            } catch (java.lang.InterruptedException e) {
                android.util.Log.e(AppLog.LOG_TAG_DB, "Exception while reading msg from queue!", e);
            }
        }else {
            try {
                cz.meteocar.unit.engine.storage.DatabaseService.sleep(200);
            } catch (java.lang.Exception e) {
                android.util.Log.e(AppLog.LOG_TAG_DB, "Error when sleep.", e);
            }
        }
    } 
    android.util.Log.d(AppLog.LOG_TAG_DB, "Database Service exited LOOP");
}