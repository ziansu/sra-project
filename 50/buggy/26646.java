public void onClick(android.view.View v) {
    if (!(com.meezo.eventtus.twittereventtus.ListOnLineFollowersActivity.waitingForRefresh))
        com.meezo.eventtus.twittereventtus.ListOnLineFollowersActivity.onLineFollowersListKeeper.forceRefresh();
    
}