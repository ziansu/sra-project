private void saveNewsList(java.util.List<io.github.izzyleung.zhihudailypurify.bean.DailyNews> newsList) {
    io.github.izzyleung.zhihudailypurify.db.DailyNewsDataSource dataSource = io.github.izzyleung.zhihudailypurify.ZhihuDailyPurifyApplication.getDataSource();
    java.lang.String date = newsList.get(0).getDate();
    java.util.List<io.github.izzyleung.zhihudailypurify.bean.DailyNews> originalData = dataSource.newsOfTheDay(date);
    boolean isDataUnchanged = (originalData == null) || (originalData.equals(newsList));
    if (!isDataUnchanged) {
        dataSource.insertOrUpdateNewsList(date, new com.google.gson.GsonBuilder().create().toJson(newsList));
    }
}