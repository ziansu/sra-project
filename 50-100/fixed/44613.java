public static android.database.Cursor getChildren(java.lang.String shortDate) {
    java.lang.String whereIn = ("'" + (com.untappedkegg.rally.AppState.SOURCE_RALLY_AMERICA)) + "'";
    final java.util.Set<java.lang.String> feeds = com.untappedkegg.rally.AppState.getSettings().getStringSet("event_feeds", null);
    if (feeds != null) {
        for (java.lang.String feed : feeds) {
            whereIn += (", '" + feed) + "'";
        }
    }
    return dbAdapter.select(java.lang.String.format("SELECT * FROM %s WHERE %s IN (%s) AND %s = '%s' ORDER BY %s DESC", com.untappedkegg.rally.news.DbNews.NEWS_TABLE, com.untappedkegg.rally.news.DbNews.SOURCE, whereIn, com.untappedkegg.rally.news.DbNews.SHORTDATE, shortDate, com.untappedkegg.rally.news.DbNews.PUBDATE));
}