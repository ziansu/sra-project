@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.parse.Parse.enableLocalDatastore(this);
    com.parse.Parse.initialize(this, "Application ID", "Client Key");
    com.facebook.FacebookSdk.sdkInitialize(getApplicationContext());
    com.parse.ParseFacebookUtils.initialize(this);
}