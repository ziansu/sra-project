@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_article_list);
    mSwipeRefreshLayout = ((android.support.v4.widget.SwipeRefreshLayout) (findViewById(R.id.swipe_refresh_layout)));
    mRecyclerView = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.recycler_view)));
    getLoaderManager().initLoader(0, null, this);
    if (savedInstanceState == null) {
        refresh();
    }
}