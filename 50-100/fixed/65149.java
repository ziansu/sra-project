public void gatherTheTweets(java.lang.String user) {
    allTheTweets.clear();
    allTheTweets.clear();
    int pageCount = 1;
    twitter4j.Paging statusPage = new twitter4j.Paging(1, 100);
    while (pageCount <= 10) {
        try {
            allTheTweets.addAll(weebBot.getUserTimeline(user, statusPage));
        } catch (twitter4j.TwitterException twitterError) {
            baseController.handleErrors(twitterError);
        }
        pageCount++;
    } 
}