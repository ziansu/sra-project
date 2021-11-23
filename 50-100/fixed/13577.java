@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_timetable_detail);
    toolbar = findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    if ((getSupportActionBar()) != null)
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    
    butterknife.ButterKnife.bind(this);
    android.content.Intent intent = getIntent();
    _id = intent.getLongExtra("_id", 1);
}