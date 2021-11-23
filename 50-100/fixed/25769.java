@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_recycler);
    java.util.List<de.schueler.layoutviewsdemo.data.Topic> topics = new java.util.ArrayList<>();
    recyclerView = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.recyclerView)));
    recyclerView.setAdapter(new de.schueler.layoutviewsdemo.adapter.RecyclerAdapter(topics));
}