public java.util.List<com.example.alex.androidclient.models.DailyStatistics> getDailyStatisticsForSite(int siteId, java.util.Date startDate, java.util.Date finishDate) throws org.json.JSONException {
    java.util.List<com.example.alex.androidclient.models.DailyStatistics> dailyStatsForSite = new java.util.ArrayList<>();
    java.util.List<com.example.alex.androidclient.models.DailyStatistics> dailyStats = new java.util.ArrayList<>();
    if (jHelper.getDailyStats().isEmpty()) {
        com.example.alex.androidclient.helpers.JSONHelper jHelperDailyStats = new com.example.alex.androidclient.helpers.JSONHelper(startDate, finishDate);
        dailyStats = jHelperDailyStats.getDailyStats(startDate, finishDate);
    }
    return dailyStatsForSite;
}