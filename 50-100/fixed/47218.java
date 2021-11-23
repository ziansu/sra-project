private void configureRetweetsForTweet(com.codepath.apps.squawker.Models.Tweet tweet) {
    com.codepath.apps.squawker.UserStorage userStorage = new com.codepath.apps.squawker.UserStorage(getApplicationContext());
    if ((userStorage.getUserId()) == (tweet.getUser().getuId())) {
        ibDetailRetweet.setEnabled(false);
    }else {
        ibDetailRetweet.setEnabled(true);
        ibDetailRetweet.setSelected(tweet.isRetweeted());
    }
    int retweetCount = tweet.getRetweetCount();
    tvDetailRetweetCount.setText(java.lang.String.valueOf(retweetCount));
}