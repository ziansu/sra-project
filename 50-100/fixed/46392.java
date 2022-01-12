@java.lang.Override
public void nextTuple() {
    try {
        twitter4j.QueryResult queryResult = twitter.search(query);
        for (twitter4j.Status s : queryResult.getTweets()) {
            java.lang.String tmp = ((" Geo: " + (s.getGeoLocation())) + " Tweet: ") + (s.getText());
            _collector.emit(new org.apache.storm.tuple.Values(tmp));
        }
    } catch (twitter4j.TwitterException e) {
        e.printStackTrace();
    }
}