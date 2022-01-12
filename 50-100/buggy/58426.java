public static int weight(at.tuwien.aic.tweetanalysis.entities.Tweet tweet) {
    int rts = tweet.getRetweetCount();
    int favs = tweet.getFavoriteCount();
    int result = 1;
    if ((rts * (at.tuwien.aic.tweetanalysis.aggregator.SimpleAggregator.WEIGHT_RETWEET)) > 1) {
        result += rts * (at.tuwien.aic.tweetanalysis.aggregator.SimpleAggregator.WEIGHT_RETWEET);
    }
    if ((favs * (at.tuwien.aic.tweetanalysis.aggregator.SimpleAggregator.WEIGHT_FAV)) > 1) {
        result += favs * (at.tuwien.aic.tweetanalysis.aggregator.SimpleAggregator.WEIGHT_FAV);
    }
    return result;
}