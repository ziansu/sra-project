@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_maps);
    drawRectView = ((at.tba.treasurehunt.utils.RectangleDrawView) (findViewById(R.id.rectView)));
    drawRectView.setBackgroundColor(Color.TRANSPARENT);
    mProgressView = findViewById(R.id.load_treasure_progress);
    mMapsFrameLayout = findViewById(R.id.mapsContent);
    setUpMapIfNeeded();
    getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    at.tba.treasurehunt.activities.ActivityManager.setCurrentActivity(this);
    loadTreasures();
}