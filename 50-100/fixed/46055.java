@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_camera);
    getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    server = getIntent().getStringExtra("server");
    port = getIntent().getIntExtra("port", 9999);
    managePort = getIntent().getIntExtra("manage_port", 8086);
    getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    cn.com.chinatelecom.zlwcameraclient.Applications.getInstance().addActivity(this);
    initSurfaceView();
}