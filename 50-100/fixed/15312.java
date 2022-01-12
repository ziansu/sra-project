@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (!(isOnline())) {
        setContentView(R.layout.activity_layout_offline);
        return ;
    }
    setContentView(R.layout.activity_main);
    movieRecyclerView = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.rv_movies)));
    android.support.v7.widget.RecyclerView.LayoutManager layoutManager = new android.support.v7.widget.GridLayoutManager(this, com.ashl7developer.popularmovies.MainActivity.NUM_COLUMNS);
    movieRecyclerView.setHasFixedSize(true);
    movieRecyclerView.setLayoutManager(layoutManager);
    com.ashl7developer.popularmovies.MainActivity.GetMoviesBackgroundTask task = new com.ashl7developer.popularmovies.MainActivity.GetMoviesBackgroundTask();
    task.execute(NetworkUtil.SORT_ORDER_POPULARITY);
}