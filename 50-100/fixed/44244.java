public static android.database.Cursor fetchCarouselCurrentEvents() {
    java.lang.String whereIn = ("'" + (com.untappedkegg.rally.AppState.SOURCE_RALLY_AMERICA)) + "'";
    final java.util.Set<java.lang.String> feeds = com.untappedkegg.rally.AppState.getSettings().getStringSet("event_feeds", null);
    if (feeds != null) {
        for (java.lang.String feed : feeds) {
            whereIn += (", '" + feed) + "'";
        }
    }
    return dbAdapter.selectf("SELECT * FROM %s WHERE %s in (%s) ORDER BY %s DESC LIMIT 5", com.untappedkegg.rally.news.DbNews.NEWS_TABLE, com.untappedkegg.rally.news.DbNews.SOURCE, whereIn, com.untappedkegg.rally.news.DbNews.PUBDATE);
}