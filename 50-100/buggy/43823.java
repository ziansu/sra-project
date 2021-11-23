@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_splash);
    context = this;
    android.widget.TextView text = ((android.widget.TextView) (findViewById(R.id.falsetice_id)));
    android.os.Handler handler = new android.os.Handler();
    handler.postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            startActivity(new android.content.Intent(caresurvey.sci.com.caresurvey.activity.SplashActivity.this, caresurvey.sci.com.caresurvey.activity.LoginActivity.class));
            overridePendingTransition(0, 0);
            finish();
        }
    }, 3000);
}