@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    java.lang.System.out.printf("this is a test");
    android.content.Intent intent = new android.content.Intent(this, com.moss.dbreader.service.NovelEngineService.class);
    bindService(intent, this, Context.BIND_AUTO_CREATE);
}