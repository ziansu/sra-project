@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_controller);
    android.content.Intent intent = getIntent();
    addr = intent.getStringExtra("addr");
    port = intent.getIntExtra("port", 20);
    intent = new android.content.Intent(getApplicationContext(), com.example.jack.android_controller.MultitouchView.class);
    intent.putExtra("addr", addr);
    intent.putExtra("port", port);
}