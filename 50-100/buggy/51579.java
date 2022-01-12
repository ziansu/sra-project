@java.lang.Override
protected void onCreate(final android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_connect);
    initUI();
    prefs = new com.gardion.vpn.utils.Prefs(this);
    setColoBar();
    mHandler = new android.os.Handler();
    getBundle(getIntent());
    int delay = 2000;
    if (fromCodeActivity) {
        delay = 0;
    }
    mHandler.postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            startAfterSplash();
        }
    }, delay);
}