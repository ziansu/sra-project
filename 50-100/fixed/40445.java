private java.time.ZonedDateTime lastTimePrintBeforeTweet(java.time.ZonedDateTime tweetTimeStamp) {
    if ((tweetTimeStamp.toLocalTime().compareTo(stockMarketOpenTime)) < 0) {
        return java.time.ZonedDateTime.of(stockMarketCloseTime.atDate(tweetTimeStamp.toLocalDate().minusDays(1)), timeZone);
    }else
        if ((tweetTimeStamp.toLocalTime().compareTo(stockMarketCloseTime)) > 0) {
            return java.time.ZonedDateTime.of(stockMarketCloseTime.atDate(tweetTimeStamp.toLocalDate()), timeZone);
        }else {
            return tweetTimeStamp;
        }
    
}