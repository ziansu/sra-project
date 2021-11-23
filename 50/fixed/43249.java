@java.lang.SuppressWarnings(value = "deprecation")
@org.junit.Test
public void testDownloadStockData() {
    scheduledTask.downloadDailyData();
    scheduledTask.getWeeklyFromDailyForCurrentWeek();
}