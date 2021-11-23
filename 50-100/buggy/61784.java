public void updateRank(java.lang.String newsId, int rank) {
    android.content.ContentValues cv = new android.content.ContentValues();
    cv.put(DetailColumns.RANK, rank);
    mContext.getContentResolver().update(HackerNewsProvider.NewsFeed.CONTENT_URI, cv, ((((me.abhrajit.hackernewsreader.data.DetailColumns.NEWS_ID) + "='") + newsId) + "'"), null);
    java.lang.System.out.println((((("Rank updated for " + newsId) + " to ") + rank) + 1));
}