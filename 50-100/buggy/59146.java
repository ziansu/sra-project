@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.recycle_example);
    recyclerView = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.recyclerView)));
    android.support.v7.widget.LinearLayoutManager linerLayoutMng = new android.support.v7.widget.LinearLayoutManager(this);
    recyclerView.setLayoutManager(linerLayoutMng);
    adapter = new com.example.ciccc_cirac.lifecycleproject.GreenAdapter1(com.example.ciccc_cirac.lifecycleproject.MainActivity2.LIST_COUNT);
    recyclerView.setAdapter(adapter);
}