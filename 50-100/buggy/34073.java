@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    com.example.abhi.saarangbeta.ActionBar actionBar = getSupportActionBar();
    actionBar.setTitle("Saarang 2017");
    android.support.v7.widget.RecyclerView recyclerView = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.recyclerView)));
    recyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(this));
    recyclerView.setAdapter(new com.example.abhi.saarangbeta.SimpleAdapter(com.example.abhi.saarangbeta.MainActivity.data));
}