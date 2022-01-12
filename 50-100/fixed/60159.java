@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_first);
    int DELAY = 1000;
    android.os.Handler handler = new android.os.Handler();
    handler.postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            onAppStart();
        }
    }, DELAY);
}