@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mRefreshLayout = ((android.support.v4.widget.SwipeRefreshLayout) (findViewById(R.id.refreshLayout)));
    mRecyclerView = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.recyclerView)));
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    GirlApiComponent.Initializer.init().inject(this);
    swipeRefresh();
    setupRecyclerView();
    onImageClick();
}