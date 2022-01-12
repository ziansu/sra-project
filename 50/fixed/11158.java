public java.util.ArrayList<twitter4j.Status> downloadNewTweets() {
    if (com.leebrimelow.twitter.Service.Twitter_Loader_Poster_Service.isDownloadedTweets) {
        com.leebrimelow.twitter.Service.Twitter_Loader_Poster_Service.isDownloadedTweets = false;
        com.leebrimelow.twitter.Service.Twitter_Loader_Poster_Service.mHandler.postDelayed(mTweetsCheckup, com.leebrimelow.twitter.Service.Twitter_Loader_Poster_Service.TIME_DELAY_Tweets_CHECKUP);
        com.leebrimelow.twitter.Service.Twitter_Loader_Poster_Service.isDownloadingTweets = true;
        com.leebrimelow.twitter.Service.Twitter_Loader_Poster_Service.newTweetsNotificationManager.cancel(com.leebrimelow.twitter.Service.Twitter_Loader_Poster_Service.Tweets_NOTIFICATION_ID);
        return com.leebrimelow.twitter.Service.Twitter_Loader_Poster_Service.newTweetsList;
    }else
        return null;
    
}