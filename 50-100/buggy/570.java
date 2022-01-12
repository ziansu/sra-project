public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.roomlist_activity);
    extras = getIntent().getExtras();
    makeList();
    final android.app.Activity fA = this;
    recyclerView = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.recyclerview_rooms)));
    rvLayoutManager = new android.support.v7.widget.LinearLayoutManager(fA);
    recyclerView.setLayoutManager(rvLayoutManager);
    rvadapter = new com.example.jendrik.moerder.GUI.Host.AdapterClasses.RoomAdapterClass();
    recyclerView.setAdapter(rvadapter);
    recyclerView.setDescendantFocusability(ViewGroup.FOCUS_BLOCK_DESCENDANTS);
}