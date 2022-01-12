@java.lang.Override
public void run() {
    mSwipeRefreshLayout.setRefreshing(false);
    addFeedItem(new java.lang.Thread("External User", "This message was downloaded from the Internet", 1));
}