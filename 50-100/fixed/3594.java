@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    _contentView = findViewById(R.id.layout_main);
    getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, new ch.hsr.zedcontrol.MainFragment()).commit();
    if (savedInstanceState == null) {
        initConnectionReceiver();
        connectionManager = new ch.hsr.zedcontrol.roborio.ConnectionManager(this);
    }
}