@java.lang.Override
protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    dbHelper = new com.example.testapp.db.DbHelper(getContext());
    com.example.testapp.feed.FeedScreen screen = flow.Flow.getKey(this);
    if (screen == null) {
        return ;
    }
    userName = screen.getUserName();
    getUserInfo();
    initUserInfo();
    initRepoList();
    doSomeActioAppropriateToButton();
    android.util.Log.d(com.example.testapp.feed.DefaultFeedView.TAG, ("onAttachedToWindow:  userN " + (userName)));
}