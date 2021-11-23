@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.splash);
    final vn.mbm.phimp.me.SplashScreen sPlashScreen = this;
    splashTread = new java.lang.Thread() {
        @java.lang.Override
        public void run() {
            try {
                synchronized(this) {
                    wait(_splashTime);
                }
            } catch (java.lang.InterruptedException e) {
            } finally {
                finish();
                android.content.Intent i = new android.content.Intent();
                i.setClass(sPlashScreen, vn.mbm.phimp.me.PhimpMe.class);
                startActivity(i);
            }
        }
    };
    splashTread.start();
}