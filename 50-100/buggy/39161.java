private void saveFeeds(java.sql.Statement statement, system.FeedList feedList) throws java.lang.Exception {
    for (system.rss.Feed feed : feedList.getFeeds()) {
        java.lang.String addFeedQuery = (((("INSERT INTO save_data_feeds (URLTOXML,FEEDLISTNAME) " + "VALUES ('") + (feed.getUrlToXML())) + "','") + (feedList.getName())) + "');";
        statement.executeUpdate(addFeedQuery);
    }
}