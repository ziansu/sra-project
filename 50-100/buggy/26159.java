@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_splash_screen);
    setAnimation();
    new android.os.Handler().postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            android.content.Intent i = new android.content.Intent(getApplicationContext(), com.example.rohit.examapp.BaseActivity.class);
            startActivity(i);
            finish();
        }
    }, 1000);
}