@java.lang.Override
protected void onCreate(final android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    registerReceiver(uiUpdated, new android.content.IntentFilter("BLOOMINFO_UPDATED"));
    setContentView(R.layout.activity_network);
    bloominfo_text = "BLRGSADSAD";
    android.widget.ListView view = ((android.widget.ListView) (findViewById(R.id.peerlistview)));
    view.setEmptyView(findViewById(R.id.empty_list_view));
    view.setAdapter(getGAService().peerListAdapter);
}