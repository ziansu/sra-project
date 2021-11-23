@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.content.Intent intent = getIntent();
    this.addr = intent.getStringExtra("addr");
    this.port = intent.getIntExtra("port", 20);
    setContentView(R.layout.activity_controller);
}