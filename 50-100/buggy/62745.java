@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    mDisplay = ((android.widget.TextView) (findViewById(R.id.display)));
    context = getApplicationContext();
    if (checkPlayServices()) {
        gcm = com.google.android.gms.gcm.GoogleCloudMessaging.getInstance(this);
        regid = getRegistrationId(context);
        if (regid.isEmpty()) {
            registerInBackground();
        }
    }else {
        android.util.Log.i(example.com.mobidoc.CommunicationLayer.pushNotificationServices.DemoActivity.TAG, "No valid Google Play Services APK found.");
    }
}