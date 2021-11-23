protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_splash);
    butterknife.ButterKnife.bind(this);
    android.util.DisplayMetrics metrics = new android.util.DisplayMetrics();
    getWindowManager().getDefaultDisplay().getMetrics(metrics);
    mHandler = new android.os.Handler(getMainLooper());
    loadBackground();
}