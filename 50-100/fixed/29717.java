@java.lang.Override
protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    com.example.testapp.feed.FeedScreen screen = flow.Flow.getKey(this);
    if (screen == null) {
        return ;
    }
    userName = screen.getUserName();
    getUserInfo();
    initUserInfo();
    initRepoList();
    doSomeActioAppropriateToButton();
}