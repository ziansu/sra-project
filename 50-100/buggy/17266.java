void processTweet(Status status) {
    if (status.isRetweet()) {
        status = status.getRetweetedStatus();
        listener.setRETWEET_CCOUNT(((listener.getRETWEET_CCOUNT()) + 1));
    }
    databaseWriter.writeTweet(new StatusPOJO(status, keyword));
    listener.setTWEET_COUNT(((listener.getTWEET_COUNT()) + 1));
}