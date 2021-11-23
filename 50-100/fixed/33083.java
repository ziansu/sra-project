@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_spash);
    new android.os.Handler().postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            android.content.Intent intent = new android.content.Intent(com.example.patch.cupan.CupanSplash.this, com.example.patch.cupan.MainActivity.class);
            startActivity(intent);
            finish();
        }
    }, com.example.patch.cupan.CupanSplash.SPLASH_TIME_OUT);
}