public static void index() {
    com.google.gson.Gson gson = new com.google.gson.Gson();
    int statsCount = ((int) (controllers.DailyStat.count()));
    java.util.List<controllers.DailyStat> dailyStats = controllers.DailyStat.all().from((statsCount - 5)).fetch(5);
    if (dailyStats != null) {
        render(dailyStats);
    }else {
        renderHtml("empty");
    }
}