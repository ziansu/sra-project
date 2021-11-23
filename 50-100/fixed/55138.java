@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    super.onCreate(savedInstanceState);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    overridePendingTransition(R.anim.null_anim, R.anim.null_anim);
    setContentView(R.layout.activity_load_res);
    android.util.Log.d("LoadResActivity", "start install");
    android.content.Intent from = getIntent();
    messenger = from.getParcelableExtra("MESSENGER");
    dexTask = new com.synaric.dex.LoadResActivity.LoadDexTask();
    dexTask.execute();
}