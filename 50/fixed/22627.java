@java.lang.Override
public void run() {
    android.os.Process.setThreadPriority(android.os.Process.THREAD_PRIORITY_BACKGROUND);
    try {
        mSessions = com.androsz.electricsleepbeta.db.SleepSessions.getStartAndEndTimesFromCursor(this, data);
        eventsChanged((-1));
    } catch (java.lang.IllegalStateException ex) {
    } catch (android.database.StaleDataException ex) {
    }
}