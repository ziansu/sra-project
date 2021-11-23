@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.support.v7.widget.RecyclerView recyclerView = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.recycler_view)));
    android.support.v7.widget.RecyclerView.LayoutManager layoutManager = new android.support.v7.widget.LinearLayoutManager(this);
    recyclerView.setLayoutManager(layoutManager);
    recyclerView.setAdapter(new com.github.bleeding182.recyclerviewdecorations.HeaderItemTestAdapter());
    recyclerView.addItemDecoration(new com.github.bleeding182.recyclerviewdecorations.CardViewDecoration(getResources(), android.graphics.Color.WHITE, 0.0F));
}