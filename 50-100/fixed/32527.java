@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    textView = ((android.widget.EditText) (findViewById(R.id.queryGifs)));
    gifsList = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.gifsList)));
    android.support.v7.widget.RecyclerView.LayoutManager layoutManager = new android.support.v7.widget.LinearLayoutManager(this);
    gifsList.setLayoutManager(layoutManager);
    data = new java.util.ArrayList<>();
}