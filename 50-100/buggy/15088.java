@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    requestWindowFeature(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    mGameDisplay = getWindowManager().getDefaultDisplay();
    mGameDisplay.getSize(com.dev.anshul.curve_fever.GameActivity.mScreenSize);
    hideSystemUI();
    setContentView(new com.dev.anshul.curve_fever.GameView(this, getWindow()));
}