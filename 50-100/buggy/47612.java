@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.parse.Parse.enableLocalDatastore(this);
    com.parse.Parse.initialize(new com.parse.Parse.Configuration.Builder(getApplicationContext()).applicationId(Configs.APPLICATION_ID).clientKey(null).server(Configs.APPLICATION_URL).build());
    com.parse.ParseUser.enableAutomaticUser();
    com.parse.ParseACL defaultACL = new com.parse.ParseACL();
    com.parse.ParseACL.setDefaultACL(defaultACL, true);
}