@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.splash);
    java.lang.Thread timerThread = new java.lang.Thread() {
        public void run() {
            try {
                java.lang.Thread.sleep(3000);
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            } finally {
                android.content.Intent intent = new android.content.Intent(com.example.eliasvensson.busify.SplashScreen.this, com.example.eliasvensson.busify.MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        }
    };
    com.example.eliasvensson.busify.g timerThread;
    start();
}