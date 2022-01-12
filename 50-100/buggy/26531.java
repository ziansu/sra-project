@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_entity_list);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.entry_toolbar)));
    setSupportActionBar(toolbar);
    prepareRecyclerView();
    prepareFAB();
    shadowView = findViewById(R.id.shadowView);
    prepareShadowView();
    prepareFABHideThread();
    prepareSwitch();
    fabHideThread.start();
    final android.support.v7.app.ActionBar ab = getSupportActionBar();
    ab.setDisplayHomeAsUpEnabled(true);
}