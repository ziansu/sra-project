@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    try {
        setContentView(R.layout.activity_main);
    } catch (java.lang.Exception ex) {
        setContentView(R.layout.activity_main_olddev);
    }
    tvInfo = ((android.widget.TextView) (findViewById(R.id.tvInfo)));
    tvInfo.setTypeface(android.graphics.Typeface.createFromAsset(getAssets(), "fonts/Terminus.otf"), Typeface.NORMAL);
    if (checkLocationPermission())
        run();
    else
        android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ Manifest.permission.ACCESS_FINE_LOCATION }, 1);
    
}