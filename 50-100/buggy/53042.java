@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mContext = this;
    setContentView(R.layout.activity_alarm_list);
    android.support.v7.widget.RecyclerView mRecyclerView = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.my_recycler_view)));
    mRecyclerView.addOnItemTouchListener(new com.closetoeuphoria.keepmehonest.AlarmListItemClickListener(this, this));
    mRecyclerView.setHasFixedSize(true);
    android.support.v7.widget.RecyclerView.LayoutManager mLayoutManager = new android.support.v7.widget.LinearLayoutManager(this);
    mRecyclerView.setLayoutManager(mLayoutManager);
    mAdapter = new com.closetoeuphoria.keepmehonest.AlarmListAdapter(this, dbHelper.getAlarms());
    mRecyclerView.setAdapter(mAdapter);
}