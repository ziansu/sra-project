@java.lang.Override
public void run() {
    try {
        oneDayTimerLatch.await();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    java.lang.Object[] trends = oneDayStatistics.findAndGetTrends();
    oneDayStatistics.clearStatistics();
    updateOutputFile(oneDayResults, trends, ((time) / (6 * 24)), "Day");
    oneHourTimerLatch = new java.util.concurrent.CountDownLatch(24);
}