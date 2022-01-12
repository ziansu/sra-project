@java.lang.Override
protected void onCreate(final android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_network);
    android.widget.ListView view = ((android.widget.ListView) (findViewById(R.id.peerlistview)));
    view.setEmptyView(findViewById(R.id.empty_list_view));
    view.setAdapter(getGAService().peerListAdapter);
}