@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_arena_list);
    arenaListView = ((android.widget.ListView) (findViewById(R.id.arenaListView)));
    arenaListView.setAdapter(new android.widget.ArrayAdapter<java.lang.String>(this, android.R.layout.simple_selectable_list_item, com.o2sports.hxiao.o2basketball.ArenaList.strs));
}