@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.example.helloworld.ComplimentService.initialize(this);
    setContentView(R.layout.activity_main);
}