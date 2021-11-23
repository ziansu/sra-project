@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    android.content.Intent intent = getIntent();
    latx = ((double) (intent.getDoubleExtra("latitude", 0.0)));
    laty = ((double) (intent.getDoubleExtra("longitude", 0.0)));
    latx += 0.00290532687912;
    laty += 0.01074687519;
    setView();
    com.gime.locationsb.AddWallMgr.getInstance(this).showBannerAdd(this);
}