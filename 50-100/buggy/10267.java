@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_splash);
    textView = ((android.widget.TextView) (findViewById(R.id.textView)));
    int permission = android.support.v4.app.ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE);
    if (permission != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        android.support.v4.app.ActivityCompat.requestPermissions(this, com.example.qmma.featuredetection.SplashActivity.PERMISSIONS_STORAGE, com.example.qmma.featuredetection.SplashActivity.REQUEST_EXTERNAL_STORAGE);
    }
    com.example.qmma.featuredetection.SplashActivity.Loader loader = new com.example.qmma.featuredetection.SplashActivity.Loader();
    loader.execute(this);
}