@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    setContentView(R.layout.activity_image_view);
    loadViews();
    android.content.Intent intent = getIntent();
    resid = intent.getIntExtra("drawableid", R.drawable.pyruvate_00000);
    if ((getScreenOrientation()) == (android.content.res.Configuration.ORIENTATION_LANDSCAPE)) {
        setBackground();
    }
}