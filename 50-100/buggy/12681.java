@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    myCouchBase = new com.github.dev.williamg.simplecouchbaseapp.MyCouchBase(this);
    editText = ((android.widget.EditText) (findViewById(R.id.main_text)));
    recyclerView = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.main_recycler_view)));
    recyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(this));
    recyclerView.setAdapter(new com.github.dev.williamg.simplecouchbaseapp.DocumentAdapter(myCouchBase.getAllDocumentsId(), this));
    myCouchBase.close();
}