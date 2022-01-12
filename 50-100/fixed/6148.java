private static void updateFeedSourceDB(java.lang.String source_name, java.lang.String channel, java.lang.String last_update_time, java.lang.String previous_last_update) throws java.io.IOException, java.sql.SQLException {
    java.net.URL url = new java.net.URL(com.davidwang.feed.utils.Const.UPDATE_SOURCE);
    java.util.Map<java.lang.String, java.lang.Object> params = new java.util.LinkedHashMap<>();
    params.put("source_name", source_name);
    params.put("channel", channel);
    params.put("last_update_time", last_update_time);
    params.put("previous_last_update", previous_last_update);
    com.davidwang.feed.parse.ParseFeed.PostToServer(url, params);
}