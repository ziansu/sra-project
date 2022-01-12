@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    super.onPostExecute(aVoid);
    if ((timelineList) != null) {
        tweetsList = timelineControl.getTweetsList(timelineList);
        timelineControl.addTweets(tweetsList);
        swipeLayout.setRefreshing(false);
    }
}