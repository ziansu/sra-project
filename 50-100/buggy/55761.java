@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mJListView = ((com.hisrv.lib.jlistview.JListView) (findViewById(R.id.jlist)));
    mJListView.setFooterView(R.layout.footer);
    mJListView.setHeaderView(R.layout.header);
    mJListView.setOnHeaderListener(this);
    mJListView.setOnFooterListener(this);
    mAdapter = new android.widget.ArrayAdapter<java.lang.String>(this, R.layout.item, generateList(mStart, mEnd));
    mJListView.setAdapter(mAdapter);
    initHeaderViews();
    initFooterViews();
}