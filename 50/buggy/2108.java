@java.lang.Override
public void onRefresh() {
    after = null;
    loadPosts(subreddit, sort, after);
}