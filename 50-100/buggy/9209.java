@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_play_list);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    new com.arunsudhir.radiomalayalam.io.PlaylistReaderAsyncTask(new com.arunsudhir.radiomalayalam.io.PlaylistProgressExecutor(this)).execute();
    setContentView(R.layout.activity_no_connection);
}