@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    super.onPostExecute(aVoid);
    tweetsList = timelineControl.getTweetsList(timelineList);
    timelineControl.addTweets(tweetsList);
    swipeLayout.setRefreshing(false);
}