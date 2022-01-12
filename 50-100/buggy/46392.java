@java.lang.Override
public void nextTuple() {
    try {
        twitter4j.QueryResult queryResult = twitter.search(query);
        for (twitter4j.Status s : queryResult.getTweets()) {
            _collector.emit(new org.apache.storm.tuple.Values((((" Geo: " + (s.getGeoLocation())) + " Tweet: ") + (s.getText()))));
        }
    } catch (twitter4j.TwitterException e) {
        e.printStackTrace();
    }
}