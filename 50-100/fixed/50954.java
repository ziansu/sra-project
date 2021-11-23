@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_splash);
    mHandler = new android.os.Handler();
    mHandler.postDelayed(mPostDelayedRunnable, com.arsalan.garage.activities.SplashActivity.SPLASH_DISPLAY_LENGTH);
}