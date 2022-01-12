@java.lang.Override
public void run() {
    try {
        oneHourTimerLatch.await();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    java.lang.Object[] trends = oneHourStatistics.findAndGetTrends();
    oneDayStatistics.mergeStatistics(oneHourStatistics);
    oneHourStatistics.clearStatistics();
    updateOutputFile(oneHourResults, trends, ((time) / 6), "Hour");
    updateBackupFile("oneDateBackup.data", oneDayStatistics);
    oneDayTimerLatch.countDown();
    oneHourTimerLatch = new java.util.concurrent.CountDownLatch(5);
}