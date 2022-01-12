@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    camera = new com.example.svenscan.svenscan.utils.Camera(this, this);
    com.example.svenscan.svenscan.SvenScanApplication app = ((com.example.svenscan.svenscan.SvenScanApplication) (getApplication()));
    wordManager = app.getWordRepository();
}