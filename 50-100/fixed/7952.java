@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    io.fabric.sdk.android.Fabric.with(this, new com.crashlytics.android.Crashlytics());
    super.onCreate(savedInstanceState);
    handler = new android.os.Handler();
    runnable = new java.lang.Runnable() {
        public void run() {
            android.content.Intent intent = new android.content.Intent(com.cmmakerclub.iot.cmmciotswitch.activity.SplashActivity.this, com.cmmakerclub.iot.cmmciotswitch.activity.MainActivity.class);
            startActivity(intent);
            finish();
        }
    };
}