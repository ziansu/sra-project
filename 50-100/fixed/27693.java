@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.content.Intent serviceIntent = new android.content.Intent(this, de.dbaelz.onofftracker.services.OnOffCountService.class);
    startService(serviceIntent);
    recyclerView = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.recyclerView)));
    recyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(this));
}