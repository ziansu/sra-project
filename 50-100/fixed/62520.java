@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    adapter = new com.fallingstar.yorimi.ListViewAdapter();
    listview = ((android.widget.ListView) (findViewById(R.id.listview)));
    listview.setAdapter(adapter);
    bNavView = ((android.support.design.widget.BottomNavigationView) (findViewById(R.id.bottomNav)));
    fBtn = ((android.support.design.widget.FloatingActionButton) (findViewById(R.id.addMarketBtn)));
    initWidgets();
}