@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    setUpListView();
    intentFilter = new android.content.IntentFilter();
    intentFilter.addAction("SHOW.SNACKBAR.ADD.STUDENT");
    intentFilter.addAction("ADD.STUDENT.TO.LISTVIEW");
    registerReceiver(mReceiver, intentFilter);
}