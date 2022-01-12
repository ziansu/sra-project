@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.os.Bundle extras = getIntent().getExtras();
    if ((extras != null) && (extras.getBoolean("cdvStartInBackground", false))) {
        moveTaskToBack(true);
    }
    if (NITConfig.AUTO_ASK_FOR_PERMISSION_AT_STARTUP) {
        PermissionsActivity.run(this);
    }
    if (NITConfig.ENABLE_PROXIMITY) {
        android.util.Log.i(MainActivity.TAG, "NITManager proximity listener start");
        it.near.sdk.NearItManager.getInstance(this).addProximityListener(this);
    }
    loadUrl(launchUrl);
}