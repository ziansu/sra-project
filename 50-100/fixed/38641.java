@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_section_uer);
    mRecyclerView = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.rv_list)));
    mRecyclerView.setLayoutManager(new android.support.v7.widget.StaggeredGridLayoutManager(2, android.support.v7.widget.StaggeredGridLayoutManager.VERTICAL));
    mData = com.chad.baserecyclerviewadapterhelper.data.DataServer.getSampleData();
    com.chad.baserecyclerviewadapterhelper.adapter.SectionAdapter sectionAdapter = new com.chad.baserecyclerviewadapterhelper.adapter.SectionAdapter(this, R.layout.item_section_content, R.layout.def_section_head, mData);
    sectionAdapter.setOnRecyclerViewItemClickListener(this);
    mRecyclerView.setAdapter(sectionAdapter);
}