@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.parse.Parse.enableLocalDatastore(this);
    com.parse.Parse.initialize(this, "5NCv1Uqfleqxcn30mWAMFHYf8GaQGUeEl4Yma9Lk", "0XIJP8UiTzNc64qHAHE2EK01T2Z0j1eDZk8nfJLd");
    com.parse.ParseFacebookUtils.initialize(this);
    com.parse.ParseUser.enableRevocableSessionInBackground();
    com.parse.ParseUser.enableAutomaticUser();
    com.parse.ParseACL defaultACL = new com.parse.ParseACL();
    com.parse.ParseACL.setDefaultACL(defaultACL, true);
}